package com.hpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class HplItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(HplItemApplication.class);
    }

}
