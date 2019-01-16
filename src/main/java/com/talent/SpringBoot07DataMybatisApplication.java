package com.talent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  @MapperScan(value = "com.talent.mapper")：会扫描对应包下的所有接口并加上@Mapper注解
 */
@MapperScan(value = "com.talent.mapper")
@SpringBootApplication
public class SpringBoot07DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot07DataMybatisApplication.class, args);
    }

}

