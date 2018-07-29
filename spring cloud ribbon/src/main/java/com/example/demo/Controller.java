package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/mm",method= RequestMethod.GET)
    public String b(){

        return restTemplate.getForObject("http://ribbon/tt",String.class);

    }

    @RequestMapping(value = "/tt",method= RequestMethod.GET)
    public String a(){
        return "tt";

    }
}
