package com.dhanush.springbootpractice.controller;


import com.dhanush.springbootpractice.model.Employee;
import com.dhanush.springbootpractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/employees")
public class EmployeeV2Controller {

    @Qualifier("employeeServiceImplV2")
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee) {
        
        return employeeService.createEmployee(employee);
    }


}