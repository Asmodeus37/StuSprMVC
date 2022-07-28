package com.studentsproject.studentsmvc.service;

import com.studentsproject.studentsmvc.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);

    void deleteStudentById(Long id);
}
