package com.ricardo.nova;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ricardo.nova.dao")
@SpringBootApplication
public class NovaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NovaApplication.class, args);
    }

}
