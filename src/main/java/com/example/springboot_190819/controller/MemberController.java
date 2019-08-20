package com.example.springboot_190819.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController{
    @RequestMapping(value="/member/list")
    public void memberAction(){
        //retrun이 없다면 localhost:8080/member/list했을때 value="/member/list.html을 찾는다"
    }
}