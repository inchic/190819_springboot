package com.example.springboot_190819.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/commonCode_02")
//src.main.resources.templates가 루트 
public class CommonCodeController_02{
    @RequestMapping(value = "/edit_02", method = {RequestMethod.GET,RequestMethod.POST})
    public void edit(){
        // http://localhost:8080/commonCode_02/edit_02
    }
}