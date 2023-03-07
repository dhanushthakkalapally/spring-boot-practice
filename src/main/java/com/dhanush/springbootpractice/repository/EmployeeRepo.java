package com.dhanush.springbootpractice.repository;

import com.dhanush.springbootpractice.entitiy.EmployeeEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String> {

    EmployeeEntity findById(int id);

    @Transactional
    @Modifying
    @Query("update EmployeeEntity e set e.name= ?2, e.age= ?4, e.status= ?3 where e.id=?1")
    void updateEmployeeDetailsById(int id, String name, boolean status, int age);

    @Transactional
    void deleteById(int id);
}
