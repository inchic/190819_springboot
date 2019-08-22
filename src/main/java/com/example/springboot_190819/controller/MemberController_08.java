package com.example.springboot_190819.controller;

import java.util.HashMap;
import java.util.Map;

import com.example.springboot_190819.services.MemberService_08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member")
public class MemberController_08 {
    @Autowired
    private MemberService_08 service;

    @RequestMapping(value = "/{action}", method = { RequestMethod.GET, RequestMethod.POST })

    public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView)
    {
        String viewName = "/member/";
        Map<String, Object> resultMap = new HashMap<String, Object>();
        
        if("read".equals(action)){
            viewName += action;
            resultMap = (Map<String,Object>) service.getObject(paramMap);
            modelandView.setViewName(viewName);
            modelandView.addObject("resultMap", resultMap);

        }

        return modelandView;
    }
}
