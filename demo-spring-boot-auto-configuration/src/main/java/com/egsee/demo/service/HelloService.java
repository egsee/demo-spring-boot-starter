package com.egsee.demo.service;

import com.egsee.demo.properties.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {
    @Autowired
    HelloProperties properties;

    public String greet() {
        return "Hello " + properties.getTo() + ": " + properties.getMessage();
    }
}
