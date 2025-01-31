package cs3220.hw3.controller;

import cs3220.hw3.model.Student;
import cs3220.hw3.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    private final StudentService studentService;

    public RegisterController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        return "register";
    }

    @PostMapping("/register/add")
    public String registerSubmit(@ModelAttribute Student student) {
        studentService.addStudent(student);
        return "redirect:/students?session=" + student.getSession();
    }
}