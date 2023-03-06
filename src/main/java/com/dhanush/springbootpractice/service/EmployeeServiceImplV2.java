package com.dhanush.springbootpractice.service;

import com.dhanush.springbootpractice.entitiy.EmployeeEntity;
import com.dhanush.springbootpractice.model.Employee;
import com.dhanush.springbootpractice.repository.EmployeeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplV2 implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public Employee createEmployee(Employee employee) {

        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, entity);

        employeeRepo.save(entity);

        employee.setId();

    }

    @Override
    public Employee getEmployee(int id) {
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return null;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        return null;
    }
}
