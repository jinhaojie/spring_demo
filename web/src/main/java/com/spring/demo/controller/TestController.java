package com.spring.demo.controller;

import com.spring.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "heloo", method = RequestMethod.GET)
    public String hello() {
        return testService.hello();
    }

}
