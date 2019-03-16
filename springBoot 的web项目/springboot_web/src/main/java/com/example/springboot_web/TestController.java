package com.example.springboot_web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String testThymeleaf(ModelMap modelMap){
        modelMap.addAttribute("msg", "Hello lhx , this is thymeleaf");
        return "thymeleaf";
    }
}
