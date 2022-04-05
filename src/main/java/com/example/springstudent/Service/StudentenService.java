package com.example.springstudent.Service;

import com.example.springstudent.Repo.StudentRepo;
import com.example.springstudent.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentenService {

    private final StudentRepo repo;
    @Autowired
    public StudentenService(StudentRepo repo) {
        this.repo = repo;
    }

    public Student getStudentById(String id){
        return repo.getById(id);
    }

    public void deleteStudent(String id){
        repo.deleteStudent(id);
    }

    public Student addStudent(Student student){
        return repo.addStudent(student);
    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

    public Student updateStudent(Student student, String id) {
        return repo.updateStudent(student,id);
    }
}
