package com.example.springboot_190819.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class OrganizationController {
    @RequestMapping(value = "/organization/{action}")
    public ModelAndView read(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView) {
        String viewName = "/organization/";
        Map<String, Object> resultMap = new HashMap<String, Object>();
        if ("read".equals(action)) {
            viewName = viewName + action;
            resultMap = paramMap;
        }
        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        return modelandView;
    }

    @RequestMapping(value = "/organization/input")
    public void input() {

    }
}