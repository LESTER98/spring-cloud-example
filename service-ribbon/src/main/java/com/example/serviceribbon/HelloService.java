package com.example.serviceribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiClient(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT-HI/hi/"+name,String.class);
    }
}
