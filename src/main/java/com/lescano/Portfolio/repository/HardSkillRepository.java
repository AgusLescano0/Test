package com.lescano.Portfolio.repository;

import com.lescano.Portfolio.entity.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardSkillRepository extends JpaRepository <HardSkill, Integer>{
    
}
