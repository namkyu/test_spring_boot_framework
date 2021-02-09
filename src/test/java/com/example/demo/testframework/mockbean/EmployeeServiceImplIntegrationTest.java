package com.example.demo.testframework.mockbean;

import com.example.demo.testframework.jpatest.Employee;
import com.example.demo.testframework.jpatest.EmployeeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @Project : test-spring-test-framework
 * @Date : 2021-02-08
 * @Author : nklee
 * @Description :
 */
@RunWith(SpringRunner.class)
public class EmployeeServiceImplIntegrationTest {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {

        @Bean
        public EmployeeServiceImpl employeeService() {
            return new EmployeeServiceImpl();
        }
    }

    @Autowired
    private EmployeeServiceImpl employeeService;

    // spring context에 같은 타입의 bean이 존재하면 mock 빈으로 교체한다.
    @MockBean
    private EmployeeRepository employeeRepository;

    @Before
    public void setUp() {
        Employee alex = new Employee("nklee");
        Mockito.when(employeeRepository.findByName(alex.getName()))
                .thenReturn(alex);
    }

    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {
        String name = "nklee";
        Employee found = employeeService.getEmployeeByName(name);
        assertThat(found.getName(), is(name));
    }
}