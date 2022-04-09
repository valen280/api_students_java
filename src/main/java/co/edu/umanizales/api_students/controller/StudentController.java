package co.edu.umanizales.api_students.controller;

import co.edu.umanizales.api_students.model.Student;
import co.edu.umanizales.api_students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String getmessage()
    {
        return "Hola lindos";
    }

    @GetMapping("/all")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }
}