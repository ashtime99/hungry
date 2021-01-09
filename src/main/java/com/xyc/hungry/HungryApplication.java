package com.xyc.hungry;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
@MapperScan("com.xyc.hungry.dao")
public class HungryApplication {

    public static void main(String[] args) {
        SpringApplication.run(HungryApplication.class, args);
    }

}