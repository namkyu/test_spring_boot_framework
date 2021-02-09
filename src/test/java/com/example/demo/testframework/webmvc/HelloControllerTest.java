package com.example.demo.testframework.webmvc;

import com.example.demo.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

/**
 * @Project : test-spring-test-framework
 * @Date : 2021-02-09
 * @Author : nklee
 * @Description :
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void hello() throws Exception {
        RequestBuilder request = get("/hello");
        MvcResult mvcResult = mvc.perform(request).andReturn();
        assertThat("Hello, World", is(mvcResult.getResponse().getContentAsString()));
    }

    @Test
    public void testHelloWithName() throws Exception {
        mvc.perform(get("/hello?name=nklee"))
                .andExpect(content().string("Hello, nklee"));
    }
}
