package com.studentsproject.studentsmvc;

import com.studentsproject.studentsmvc.entity.Student;
import com.studentsproject.studentsmvc.reponsitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsMvcApplication{

    public static void main(String[] args) {
        SpringApplication.run(StudentsMvcApplication.class, args);
    }
}