package com.example.springboot_web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "hi lhx";
    }
}
