package com.github.seungyeop_lee.blog_example.architecture_in_spring.simple_with_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class SimpleWithMybatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleWithMybatisApplication.class, args);
    }
}
