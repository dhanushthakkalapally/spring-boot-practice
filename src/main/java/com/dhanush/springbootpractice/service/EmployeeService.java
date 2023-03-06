package com.dhanush.springbootpractice.service;

import com.dhanush.springbootpractice.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    Employee getEmployee(int id);

    List<Employee> getEmployees();
}