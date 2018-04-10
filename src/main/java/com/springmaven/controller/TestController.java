package com.springmaven.controller;

import com.springmaven.service.ServiceConfig;
import com.springmaven.service.UseFunctionService;
import com.springmaven.service.aspectjservice.AnnotationService;
import com.springmaven.service.aspectjservice.AspectJConfig;
import com.springmaven.service.aspectjservice.MethodService;
import com.springmaven.service.scopeservice.PrototypeService;
import com.springmaven.service.scopeservice.ScopeConfig;
import com.springmaven.service.scopeservice.SingletonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestController {
    public static void main(String[] args) {
        //Spring的Java配置和注解配置
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ServiceConfig.class);
//        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
//        System.out.println(useFunctionService.sayHello());
//        context.close();

        //Spring切面编程
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectJConfig.class);
//        AnnotationService annotationService = context.getBean(AnnotationService.class);
//        MethodService methodService = context.getBean(MethodService.class);
//        annotationService.add();
//        methodService.addFunction();
//        context.close();

        //Spring的@Scope注解
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        SingletonService s1 = context.getBean(SingletonService.class);
        SingletonService s2 = context.getBean(SingletonService.class);
        PrototypeService p1 = context.getBean(PrototypeService.class);
        PrototypeService p2 = context.getBean(PrototypeService.class);
        System.out.println("scope单例对象Singleton是否相等" + s1.equals(s2));
        System.out.println("scope的prototype对象是否相等" + p1.equals(p2));
        context.close();
    }
}
