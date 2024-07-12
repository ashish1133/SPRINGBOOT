package com.SpringBoot.leatning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TOMCAT_SERVER {
    @RequestMapping("/")
    public String great(){
        return "hello World!";
    }
}
