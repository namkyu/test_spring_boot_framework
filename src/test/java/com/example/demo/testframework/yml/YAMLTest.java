package com.example.demo.testframework.yml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:application.yml")
public class YAMLTest {

    @Autowired
    private YAMLProp yamlProp;

    @Test
    public void test() {
        assertThat("testing", is(yamlProp.getEnvironment()));
        assertThat(3, is(yamlProp.getCors().size()));
        assertThat(2, is(yamlProp.getCors2().length));
    }

}
