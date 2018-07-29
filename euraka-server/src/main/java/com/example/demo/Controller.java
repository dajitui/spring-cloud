package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class Controller {

    @Autowired
    MyFegin myFegin;

    @RequestMapping(value = "/a",method= RequestMethod.GET)
    @HystrixCommand(fallbackMethod="c")
    public String oo(){
        return myFegin.oo();
    }

    @RequestMapping(value = "/b",method= RequestMethod.GET)
    @HystrixCommand(fallbackMethod="c")
    public String b(){
        return "111";
    }

    public String c(){
        return "error";
    }
}
