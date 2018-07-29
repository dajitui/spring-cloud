package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String a(){
       return  restTemplate.getForObject("http://euraka-server/hello/b",String.class);
    }

}
