package com.auca.studRegSpring.Repository;

import com.auca.studRegSpring.Model.AcademicUnit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepo extends JpaRepository<AcademicUnit,String> {
}
