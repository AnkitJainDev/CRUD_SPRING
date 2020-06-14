package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeeDeptEntity;

@Repository
public interface EmployeeDeptRepository extends JpaRepository<EmployeeDeptEntity, Integer> {

}