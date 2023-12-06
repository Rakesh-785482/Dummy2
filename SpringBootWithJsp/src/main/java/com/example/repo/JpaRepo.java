package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employee;

public interface JpaRepo extends JpaRepository<Employee, Integer> {

}
