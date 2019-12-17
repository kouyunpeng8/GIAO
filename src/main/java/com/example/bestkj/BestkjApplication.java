package com.example.bestkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan("com.example.bestkj.dao")
public class BestkjApplication {

    public static void main(String[] args) {
        System.out.println("———————————————————————————ONE GIAO My 嘚 GIAO———————————————————————————————");
        System.out.println("—————————————————————————全世界最棒的软件开发工作者——————————————————————————————");
        System.out.println("—————————————————————————————AO LI GEI——————————————————————————————————");
        SpringApplication.run(BestkjApplication.class, args);
    }

}
