package com.example.demo.testframework.jpatest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Project : test-spring-test-framework
 * @Date : 2021-02-08
 * @Author : nklee
 * @Description :
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public Employee(String name) {
        this.name = name;
    }
}