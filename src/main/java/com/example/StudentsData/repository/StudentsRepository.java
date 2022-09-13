package com.example.StudentsData.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentsData.entity.Students;



public interface StudentsRepository extends JpaRepository<Students, Integer> {

}
