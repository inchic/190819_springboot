package com.example.springboot_190819.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController_01{
    @RequestMapping(value="/board_01", method = RequestMethod.GET )
    public String actionHome(){
        return "home_01";
    }
}