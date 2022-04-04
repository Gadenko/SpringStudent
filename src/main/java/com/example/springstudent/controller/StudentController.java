package com.example.springstudent.controller;

import com.example.springstudent.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        return List.of(new Student("Shu", "434"), new Student("David","33"));
    }
}
