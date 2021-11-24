package com.egsee.demo.configuration;

import com.egsee.demo.properties.HelloProperties;
import com.egsee.demo.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

    @ConditionalOnMissingBean
    @Bean
    public HelloService helloService(){
        HelloService service = new HelloService();
        return service;
    }
}
