package com.auca.studRegSpring.Repository;

import com.auca.studRegSpring.Model.AcademicUnit;
import com.auca.studRegSpring.Model.Course;
import com.auca.studRegSpring.Model.CourseDefinition;
import com.auca.studRegSpring.Model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
    boolean existsByDepartmentAndSemester(AcademicUnit department, Semester semester);
    public boolean existsByCourseDefinition(CourseDefinition courseDefinition);
    List<Course> findByDepartmentAndSemester(AcademicUnit department, Semester semester);

}
