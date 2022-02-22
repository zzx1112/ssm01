package com.zzx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.zzx.mapper")
public class Ssm01Application {

    public static void main(String[] args) {
        SpringApplication.run(Ssm01Application.class, args);
    }

}
