package com.lescano.Portfolio.repository;

import com.lescano.Portfolio.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository <Education, Integer>{
    
}
