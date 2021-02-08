package com.example.demo.testframework.mockbean;

import com.example.demo.testframework.jpatest.Employee;
import com.example.demo.testframework.jpatest.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Project : test-spring-test-framework
 * @Date : 2021-02-08
 * @Author : nklee
 * @Description :
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }
}