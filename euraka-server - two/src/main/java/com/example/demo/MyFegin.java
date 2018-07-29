package com.example.demo;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="euraka-server",fallback=MyFeginImpl.class)
public interface MyFegin {
    @RequestMapping(value="/hello/b",method= RequestMethod.GET)
    public String oo();
}
