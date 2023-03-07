package com.dhanush.springbootpractice.controller;


import com.dhanush.springbootpractice.model.Employee;
import com.dhanush.springbootpractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }


}
