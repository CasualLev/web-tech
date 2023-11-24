package com.auca.studRegSpring.Repository;

import com.auca.studRegSpring.Model.CourseDefinition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDefRepo extends JpaRepository<CourseDefinition,String> {
}
