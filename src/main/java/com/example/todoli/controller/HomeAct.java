package com.example.todoli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeAct {
    @RequestMapping("/")
    public String Home(){
    return "pages/index";
    }
}
