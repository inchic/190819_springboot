package com.example.springboot_190819.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationController_03{
    @RequestMapping(value = "/input_03")
    public ModelAndView read(OrganizationBean_03 paramMap, ModelAndView modelAndView){
        String viewName="/organization_03/read_03";
        modelAndView.setViewName(viewName);
        modelAndView.addObject("paramMap", paramMap);
        return modelAndView;
    }

}