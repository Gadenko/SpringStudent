package com.example.springstudent.controller;

import com.example.springstudent.Repo.StudentRepo;
import com.example.springstudent.Service.StudentenService;
import com.example.springstudent.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {


    private final StudentenService service;
    @Autowired
    public StudentController(StudentenService service) {
        this.service = service;
    }


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

    @DeleteMapping(path = "{id}")
    public void deleteStudent(@PathVariable String id){
        service.deleteStudent(id);
    }

    @PutMapping(path = "{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable String id){
        return service.updateStudent(student, id);
    }
}
