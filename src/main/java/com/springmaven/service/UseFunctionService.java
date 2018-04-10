package com.springmaven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class UseFunctionService {

//    @Autowired
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(){
        return functionService.sayHello();
    }
}
