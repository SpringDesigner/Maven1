package com.springmaven.service.aspectjservice;

import org.springframework.stereotype.Service;

/**
 * 使用方法规则被拦截类
 */
@Service
public class MethodService {

    public void addFunction(){
        System.out.println("这里需要方法拦截器");
    }
}
