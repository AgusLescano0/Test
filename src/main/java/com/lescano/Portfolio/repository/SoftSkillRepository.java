package com.lescano.Portfolio.repository;

import com.lescano.Portfolio.entity.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillRepository extends JpaRepository <SoftSkill, Integer>{
    
}
