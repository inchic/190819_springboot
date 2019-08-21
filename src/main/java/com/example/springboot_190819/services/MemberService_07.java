package com.example.springboot_190819.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

//bypass업무만 한다
//외부에서 들어오는 uri만 보고있다가
//html위치와 데이터만 조합해서 던져준다

//메모리에 인스턴스화해주는 메모리를 규정해줘야된다? @Service

@Service
public class MemberService_07{
    public Object getObject(Object dataMap){
        Map<String,Object> resultObject = new HashMap<String,Object>();
        resultObject.put("MEMBER_ID","293029301202");
        resultObject.put("NAME","name_02");
        return resultObject;
    }
}