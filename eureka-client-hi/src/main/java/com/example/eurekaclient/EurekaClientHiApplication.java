package com.example.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class EurekaClientHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientHiApplication.class, args);
    }

    @Value("${server.port}")
    public String port;

    @GetMapping("hi/{name}")
    public String hi(@PathVariable(name = "name") String name){
        return "hello "+ name +",i am from port "+port;
    }

}

