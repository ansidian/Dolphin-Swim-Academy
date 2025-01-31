package cs3220.hw3.controller;

import cs3220.hw3.model.Classes;
import cs3220.hw3.model.Student;
import cs3220.hw3.service.ClassesService;
import cs3220.hw3.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/classes")
public class ClassApiController {

    private final ClassesService classesService;
    private final StudentService studentService;

    public ClassApiController(ClassesService classesService, StudentService studentService) {
        this.classesService = classesService;
        this.studentService = studentService;
    }

    // utility method to create class response
    private Map<String, Object> createClassResponse(Classes cls) {
        Map<String, Object> classMap = new HashMap<>();
        classMap.put("id", cls.getId());
        classMap.put("session", cls.getSession());
        classMap.put("time", cls.getTime());
        classMap.put("level", cls.getLevel());
        return classMap;
    }

    // utility method to create student response
    private Map<String, Object> createStudentResponse(Student student) {
        Map<String, Object> studentMap = new HashMap<>();
        studentMap.put("id", student.getId());
        studentMap.put("name", student.getName());
        studentMap.put("age", student.getAge());
        return studentMap;
    }

    @GetMapping
    public List<Map<String, Object>> getClassesBySession(@RequestParam(defaultValue = "1") Integer session) {
        List<Classes> classes = classesService.getClassesBySession(session);

        return classes.stream().map(cls -> {
            Map<String, Object> classMap = createClassResponse(cls);
            classMap.put("numberOfStudents", cls.getStudents().size());
            return classMap;
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getClassById(@PathVariable Long id) {
        Classes cls = classesService.getClassById(id);
        if (cls == null) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Class not found with id: " + id);
            return ResponseEntity.status(404).body(errorResponse);
        }
        List<Map<String, Object>> studentDetails = cls.getStudents().stream()
                .map(this::createStudentResponse)
                .collect(Collectors.toList());

        Map<String, Object> response = createClassResponse(cls);
        response.put("students", studentDetails);

        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<?> createClass(@RequestBody Classes newClass) {
        Map<String, String> errors = new HashMap<>();

        if (newClass.getSession() == null) {
            errors.put("session", "Session is required");
        }
        if (newClass.getSession() < 1 || newClass.getSession() > 4) {
            errors.put("session", "Session must be between 1 and 4");
        }
        if (newClass.getLevel() == null || newClass.getLevel().trim().isEmpty()) {
            errors.put("level", "Level is required");
        }
        if (newClass.getTime() == null || newClass.getTime().trim().isEmpty()) {
            errors.put("time", "Time is required");
        }

        // if any errors, return 400 Bad Request
        if (!errors.isEmpty()) {
            Map<String, Object> response = new HashMap<>();
            response.put("status", "Please check your request(s).");
            response.put("errors", errors);
            return ResponseEntity.badRequest().body(response);
        }

        // create the class if validation passes
        Classes createdClass = classesService.addClass(newClass);
        return ResponseEntity.ok(createdClass);
    }

    @PostMapping("/{classId}/students/{studentId}")
    public ResponseEntity<Map<String, Object>> addStudentToClass(
            @PathVariable Long classId,
            @PathVariable Long studentId) {

        Classes cls = classesService.getClassById(classId);
        if (cls == null) {
            return ResponseEntity.notFound().build();
        }

        Student student = studentService.getStudentById(studentId);
        if (student == null) {
            return ResponseEntity.notFound().build();
        }

        if (student.getAssignedClass() != null && student.getAssignedClass().getId().equals(classId)) {
            Map<String, Object> response = new HashMap<>();
            response.put("error", "Student is already in class ID: " + classId);
            return ResponseEntity.badRequest().body(response);
        }

        // update student details to match class
        student.setSession(cls.getSession());
        student.setLevel(cls.getLevel());
        student.setTimeSlot1(cls.getTime());
        student.setAssignedClass(cls);

        Student updatedStudent = studentService.updateStudent(student);

        Map<String, Object> response = new HashMap<>();
        response.put("message", "Student successfully assigned to class ID:" + classId + ".");
        response.put("classId", classId);
        response.put("studentId", studentId);
        return ResponseEntity.ok(response);
    }
}