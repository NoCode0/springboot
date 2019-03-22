package com.atguigu.jsonData;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=JsonInterfaceApplication.class)
@AutoConfigureMockMvc
public class ControllerTest {
    
//    @Autowired
//    private WebApplicationContext wac;

    @Autowired
    private MockMvc mvc;

//    @Before
//    public void setupMockMvc(){
//        mvc = MockMvcBuilders.webAppContextSetup(wac).build(); //初始化MockMvc对象
//    }

    @Test
    public void tset() throws Exception{
        String json = mvc.perform(MockMvcRequestBuilders.get("/emps2")
                .accept(MediaType.APPLICATION_JSON_UTF8)
        )
       .andReturn().getResponse().getContentAsString();
        System.out.println(json);
    }
}
