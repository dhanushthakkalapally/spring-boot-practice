package com.dhanush.springbootpractice.controller;

import com.dhanush.springbootpractice.model.Employee;
import com.dhanush.springbootpractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getEmployee(@PathVariable("id") int id) {
        return employeeService.getEmployee(id);
    }

}
