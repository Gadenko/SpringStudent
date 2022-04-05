package com.example.springstudent.controller;

import com.example.springstudent.Repo.StudentRepo;
import com.example.springstudent.Service.StudentenService;
import com.example.springstudent.model.Student;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentControllerTest {

    private StudentRepo studentenRepo = mock(StudentRepo.class);
    private StudentenService studentenService = new StudentenService(studentenRepo);

    @Test
    void getStudentById_whenId1_thenReturnStudentWithId() {
        when(studentenRepo.getById("1")).thenReturn(new Student("David","1"));

        Student actual = studentenService.getStudentById("1");

        Student expected = new Student("David", "1");

        verify(studentenRepo).getById("1");
        assertEquals(expected,actual);

    }
}