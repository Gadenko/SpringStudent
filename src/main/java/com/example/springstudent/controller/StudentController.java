package com.example.springstudent.controller;

import com.example.springstudent.Service.StudentenService;
import com.example.springstudent.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    StudentenService service = new StudentenService();

    @GetMapping
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }

    @GetMapping(path = "{id}")
    public Student getStudentById(@PathVariable String id){
        return service.getStudentById(id);
    }

    @PostMapping
    public  Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }
}
