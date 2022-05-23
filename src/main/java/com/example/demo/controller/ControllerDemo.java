package com.example.demo.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ConfigurationProperties("amazon")
public class ControllerDemo {
    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }
}
