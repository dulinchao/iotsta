package com.club.iotclub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.club.iotclub.dao")
public class IotclubApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotclubApplication.class, args);
    }

}
