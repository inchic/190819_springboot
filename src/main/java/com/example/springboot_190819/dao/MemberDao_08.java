package com.example.springboot_190819.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
// import org.springframework.web.bind.annotation.RequestMapping;

@Repository
//데이터 담고있는클래스
public class MemberDao_08{
    public Object getObject(Object dataMap){
        Map<String,Object> resultObject=new HashMap<String,Object>();
        resultObject.put("MEMBER_ID","293029301202");
        resultObject.put("NAME","name 02");
        return resultObject;
    }
}