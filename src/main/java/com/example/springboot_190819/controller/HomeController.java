package com.example.springboot_190819.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
    @RequestMapping(value="/home")
    public String action(){
        return "index";
        //localhost:8080/home을 치면 index.html을 찾아간다
        //return값이 없다면 home.html을 찾아간다
    }
}