package com.auca.studRegSpring.Repository;

import com.auca.studRegSpring.Model.Semester;
import com.auca.studRegSpring.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {
}
