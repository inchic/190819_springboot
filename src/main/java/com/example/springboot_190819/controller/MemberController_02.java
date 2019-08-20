package com.example.springboot_190819.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member")
// src main resources templates(루트) / member
public class MemberController_02{
    @RequestMapping(value = {"/edit_02","/read","/list"}, method = {RequestMethod.GET,RequestMethod.POST})
    public void actionMethod(){

    }
}