package com.example.springboot_190819.services;



import com.example.springboot_190819.dao.MemberDao_08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService_08{
    @Autowired
    private MemberDao_08 dao;
    public Object getObject(Object dataMap){
        Object resultObject = dao.getObject(dataMap);
        return resultObject;
    }
}