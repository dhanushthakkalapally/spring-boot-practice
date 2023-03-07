package com.dhanush.springbootpractice.service;

import com.dhanush.springbootpractice.entitiy.EmployeeEntity;
import com.dhanush.springbootpractice.model.Employee;
import com.dhanush.springbootpractice.repository.EmployeeRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImplV2 implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public Employee createEmployee(Employee employee) {

        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, entity);

        employeeRepo.save(entity);

        BeanUtils.copyProperties(entity, employee);

        return employee;

    }

    @Override
    public Employee getEmployee(int id) {
         Employee employee = new Employee();
         EmployeeEntity employeeEntity = employeeRepo.findById(id);
         BeanUtils.copyProperties(employeeEntity, employee);

         return employee;
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeRepo.findAll().stream().map(employeeEntity -> {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeEntity, employee);
            return employee;
        }).collect(Collectors.toList());
        return employees;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        employeeRepo.updateEmployeeDetailsById(id, employee.getName(), employee.getStatus(), employee.getAge());
        EmployeeEntity employeeEntity = employeeRepo.findById(id);
        BeanUtils.copyProperties(employeeEntity, employee);

        return employee;
    }
    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
