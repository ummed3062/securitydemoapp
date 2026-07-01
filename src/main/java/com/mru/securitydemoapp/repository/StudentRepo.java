package com.mru.securitydemoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mru.securitydemoapp.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

    
}
