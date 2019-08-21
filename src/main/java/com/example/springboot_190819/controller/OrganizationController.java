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
    public ModelAndView asdf(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
            ModelAndView modelandView)
            //ModelAndview 클래스 이름: asdf
            //사용하는 ModelAndView껍데기(?) : modelandView = 응답할 view이름 = 리턴해줄값
        {

        String viewName = "/organization/";
        Map<String, Object> resultMap = new HashMap<String, Object>();

        if ("read".equals(action)) {
            viewName = viewName + action;
            resultMap = paramMap;

        }


        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap123", resultMap);
        //.addObject("변수 이름", "데이터 값");
        // view (여기선 read.html 에서 데이터를 읽을때 th:value="${resultMap123(변수이름).id(맵 안의 key값)}" 으로 value를 읽는다)
        return modelandView;
    }
    

    @RequestMapping(value = "/organization/input")
    public void input() {

    }
}

//list [index, value]
//map {key, value}
//key는 스트링으로 처리, id랑 pw// input값=value값은 object로 처리. 숫자나 문자가 들어올수있으니까.