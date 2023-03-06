package com.dhanush.springbootpractice.service;

import com.dhanush.springbootpractice.entitiy.EmployeeEntity;
import com.dhanush.springbootpractice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeInterface extends JpaRepository<EmployeeEntity, String> {
}
