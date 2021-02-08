package com.example.demo.testframework.mockbean;

import com.example.demo.testframework.jpatest.Employee;

/**
 * @Project : test-spring-test-framework
 * @Date : 2021-02-08
 * @Author : nklee
 * @Description :
 */
public interface EmployeeService {

    Employee getEmployeeByName(String name);
}
