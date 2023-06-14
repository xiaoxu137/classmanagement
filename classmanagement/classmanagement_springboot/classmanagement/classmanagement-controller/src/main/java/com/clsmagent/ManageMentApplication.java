package com.clsmagent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.clsmagent.mapper")
public class ManageMentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageMentApplication.class,args);
        System.out.println("class management管理项目启动成功");
    }
}
