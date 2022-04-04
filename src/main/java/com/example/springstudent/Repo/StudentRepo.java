package com.example.springstudent.Repo;

import com.example.springstudent.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepo {

    Map<String, Student> students = new HashMap<>();

    public StudentRepo(){}

    public Student getById(String id) {
        return students.get(id);
    }

    public Student addStudent(Student student) {
        students.put(student.getId(), student);
        return student;
    }

    public List<Student> getAllStudents(){
        return List.copyOf(students.values());
    }

    public void deleteStudent(String id){
        students.remove(id);
    }

    public Student updateStudent(Student student, String id) {
        students.put(id, student);
        return student;
    }
}
