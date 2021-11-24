package com.egsee.demo.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com.egsee.demo.hello")
public class HelloProperties {
    private String to;
    private String message;


    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
