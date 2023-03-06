package com.dhanush.springbootpractice.repository;

import com.dhanush.springbootpractice.entitiy.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String> {
}
