package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.mapper"})
public class Day1018Application {
    public static void main(String[] args) {
        SpringApplication.run(Day1018Application.class, args);
    }
}
