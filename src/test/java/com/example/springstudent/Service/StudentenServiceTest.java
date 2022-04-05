package com.example.springstudent.Service;

import com.example.springstudent.Repo.StudentRepo;
import com.example.springstudent.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentenServiceTest {

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