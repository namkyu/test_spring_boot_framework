package com.example.demo.testframework.jpatest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Project : test-spring-test-framework
 * @Date : 2021-02-08
 * @Author : nklee
 * @Description :
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByName(String name);
}
