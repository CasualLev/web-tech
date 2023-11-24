package com.auca.studRegSpring.Repository;

import com.auca.studRegSpring.Model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SemesterRepo extends JpaRepository<Semester, String> {
}
