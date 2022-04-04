package com.example.springstudent.Service;

import com.example.springstudent.Repo.StudentRepo;
import com.example.springstudent.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentenService {

    StudentRepo repo = new StudentRepo();

    public Student getStudentById(String id){
        return repo.getById(id);
    }

    public Student addStudent(Student student){
        return repo.addStudent(student);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

}