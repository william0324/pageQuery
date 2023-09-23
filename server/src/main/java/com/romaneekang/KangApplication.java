package com.romaneekang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.romaneekang.mapper")
public class KangApplication {
    public static void main(String[] args) {
        SpringApplication.run(KangApplication.class);
    }
}
