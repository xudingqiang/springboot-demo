package com.bella.start;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author bella
 * @since 2022/1/21
 */
@SpringBootApplication
@MapperScan("com.bella.start.dao")
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
