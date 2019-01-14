package com.talent.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author guobing
 * @Title: ServerConfig
 * @ProjectName spring-boot-06-jdbc
 * @Description: Servet容器配置
 * @date 2019/1/14下午5:48
 */
@Configuration
public class ServerConfig {

    @Bean
    public ConfigurableServletWebServerFactory servletWebServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.setPort(8081);
        return factory;
    }
}
