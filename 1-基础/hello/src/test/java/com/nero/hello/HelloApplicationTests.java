package com.nero.hello;

import com.nero.hello.web.HelloController;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.awt.*;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

    private MockMvc mockMvc;

    @Test
    public void contextLoads() {
    }

    @Before
    public void setUP() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void hello0() throws Exception {
        System.out.println("hello word");
    }

    @Test
    public void hello1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .post("/hello?name=hans")
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print());
    }

    @Test
    public void hello2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders
                .post("/hello?name=hans")
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("hans123")));
    }

}
