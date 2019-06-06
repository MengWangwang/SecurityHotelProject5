package com.security.hotel4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan(value = {"com.security.hotel4.mapper"})
public class Hotel4Application {

    public static void main(String[] args) {
        SpringApplication.run(Hotel4Application.class, args);
    }

}
