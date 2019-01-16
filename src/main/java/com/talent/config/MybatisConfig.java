package com.talent.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guobing
 * @Title: MybatisConfig
 * @ProjectName spring-boot-06-jdbc
 * @Description: 自定义mybatis规则
 * @date 2019/1/15上午10:07
 */
@Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        // 注解版设置驼峰命名规则
        return configuration -> configuration.setMapUnderscoreToCamelCase(true);
    }
}
