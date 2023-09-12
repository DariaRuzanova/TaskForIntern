package com.example.zadacha_for_intern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ZadachaForInternApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZadachaForInternApplication.class, args);
    }

}
