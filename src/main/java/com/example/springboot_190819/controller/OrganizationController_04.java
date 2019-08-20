package com.example.springboot_190819.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

public class OrganizationController_04{
    @RequestMapping(value = "/read_04")
    public ModelAndView read(@RequestParam Map<String,Object> paramMap, ModelAndView modelAndView){
        String viewName = "/organization_04/read_04";
        modelAndView.setViewName(viewName);
        modelAndView.addObject("resultMap", paramMap);
        return modelAndView;
    }
}