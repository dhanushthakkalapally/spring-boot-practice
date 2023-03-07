package com.dhanush.springbootpractice;

import com.dhanush.springbootpractice.entitiy.EmployeeEntity;
import com.dhanush.springbootpractice.repository.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeEntityTest {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Test
    public void creatNewEmployee() {
        EmployeeEntity entity = EmployeeEntity.builder().age(10).status(true).name("Dhanush").build();

        employeeRepo.save(entity);

    }

}

