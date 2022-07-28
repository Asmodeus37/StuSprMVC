package com.studentsproject.studentsmvc.reponsitory;

import com.studentsproject.studentsmvc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
