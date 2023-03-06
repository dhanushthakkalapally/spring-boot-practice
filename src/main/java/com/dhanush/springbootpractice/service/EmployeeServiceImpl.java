package com.dhanush.springbootpractice.service;

import com.dhanush.springbootpractice.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;


// Because this service class is going to be a singleton class it is okay to have single variables
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private HashMap<Integer, Employee> employeeHashMap = new HashMap<>();


    @Override
    public Employee getEmployee(int id) {
        return this.employeeHashMap.get(id);
    }

    @Override
    public Employee createEmployee(Employee employee) {
//        generate a random uuid for the employee and return to the employee
        employee.setId(this.employeeHashMap.size() + 1);
        this.employeeHashMap.put(employee.getId(), employee);
        return employee;
    }

    @Override
    public List<Employee> getEmployees() {
        return (List<Employee>) this.employeeHashMap.values();
    }
}
