package com.example.demo.testframework.jpatest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
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
@DataJpaTest
// @DataJpaTest 하는 역할
// configuring H2, an in-memory database
// setting Hibernate, Spring Data, and the DataSource
// performing an @EntityScan
// turning on SQL logging
public class EmployeeRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void whenFindByName_thenReturnEmployee() {
        // given
        Employee alex = new Employee("nklee");
        entityManager.persist(alex);
        entityManager.flush();

        // when
        Employee found = employeeRepository.findByName(alex.getName());

        // then
        assertThat(found.getName(), is(alex.getName()));
    }

}
