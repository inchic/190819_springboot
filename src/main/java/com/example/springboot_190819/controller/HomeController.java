package com.example.springboot_190819.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
    @RequestMapping(value="/home")
    public String action(){
        return "index";
    }
}