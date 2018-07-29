package com.example.demo;

import org.springframework.stereotype.Component;


@Component
public class MyFeginImpl implements MyFegin{
    @Override
    public String oo() {
        return "0 this is euraka-server";
    }
}
