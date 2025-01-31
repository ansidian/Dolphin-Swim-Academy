package cs3220.hw3.controller;

import cs3220.hw3.model.Classes;
import cs3220.hw3.model.Student;
import cs3220.hw3.service.ClassesService;
import cs3220.hw3.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ClassesController {

    private final ClassesService classesService;
    private final StudentService studentService;

    public ClassesController(ClassesService classesService, StudentService studentService) {
        this.classesService = classesService;
        this.studentService = studentService;
    }

    @GetMapping("/classes")
    public String showClasses(@RequestParam(defaultValue = "1") int session, Model model) {
        // get and filter students for this session
        List<Classes> filteredClasses = classesService.getClassesBySession(session);
        List<Student> filteredStudents = studentService.getStudentsBySession(session);

        // match students to their classes
        for (Classes cls : filteredClasses) {
            List<Student> classStudents = cls.getStudents(); // Use the JPA relationship
            cls.setStudents(classStudents);
        }

        model.addAttribute("classes", filteredClasses);
        model.addAttribute("session", session);
        model.addAttribute("activePage", "classes");
        model.addAttribute("allStudents", studentService.getStudents());

        return "classes";
    }

    @GetMapping("/classes/new")
    public String showNewClassForm(Model model) {
        model.addAttribute("activePage", "classes");
        return "newClass";
    }

    @PostMapping("/classes/add")
    public String addClass(@RequestParam int session,
                           @RequestParam String level,
                           @RequestParam String time) {

        Classes newClass = new Classes(session, level, time);
        classesService.addClass(newClass);

        return "redirect:/classes?session=" + session;
    }


    @PostMapping("/classes/assign")
    public String assignStudent(@RequestParam long studentId,
                                @RequestParam int session,
                                @RequestParam String level,
                                @RequestParam String time) {

        Student student = studentService.getStudentById(studentId);

        List<Classes> sessionClasses = classesService.getClassesBySession(session);
        Classes targetClass = sessionClasses.stream()
                .filter(c -> c.getLevel().equals(level) && c.getTime().equals(time))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Class not found"));

        // update student assignment
        student.setSession(session);
        student.setLevel(level);
        student.setTimeSlot1(time);
        student.setAssignedClass(targetClass);

        studentService.updateStudent(student);

        return "redirect:/classes?session=" + session;
    }
}