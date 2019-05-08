package com.spring.demo.service;


import org.springframework.stereotype.Service;

@Service("testService")
public class TestService {

    public String  hello() {
        return "hello";
    }
}
