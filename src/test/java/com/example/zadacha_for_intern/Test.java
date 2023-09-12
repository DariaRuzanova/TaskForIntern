package com.example.zadacha_for_intern;

import com.example.zadacha_for_intern.service.MainService;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Random;


@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class Test {
    @Autowired
    MainService mainService;

    @Autowired
    private MockMvc mockMvc;

    private static final String header = "str";

    @org.junit.Test
    @AutoConfigureMockMvc
    public void getCountCharsToStringTest() {

        String testRequest = "aaaaabbcad";
        String testResponse = "\"a\":6, \"b\":2, \"c\":1, \"d\":1";
        Assertions.assertEquals(testResponse, mainService.getCountCharsToString(testRequest));
    }

    @org.junit.Test
    public void controllerTest() throws Exception {
        var request = MockMvcRequestBuilders.get("/str")
                .header(header, "aaaaabbcad");

        mockMvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk());

    }

}
