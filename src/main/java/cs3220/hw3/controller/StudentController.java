package cs3220.hw3.controller;

import cs3220.hw3.model.Student;
import cs3220.hw3.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String showStudents(@RequestParam(defaultValue = "1") int session, Model model) {
        List<Student> students;
        students = studentService.getStudents();
        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getSession() == session)
                .toList();

        model.addAttribute("students", filteredStudents);
        model.addAttribute("session", session);
        model.addAttribute("activePage", "students");
        return "students";
    }

    @GetMapping("/api/students/{id}/assigned")
    @ResponseBody
    public Map<String, Boolean> checkStudentAssignment(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        return Map.of("assigned", student.getAssignedClass() != null);
    }
}
