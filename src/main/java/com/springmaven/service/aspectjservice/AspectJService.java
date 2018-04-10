package com.springmaven.service.aspectjservice;

import com.springmaven.aspectjinterface.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 编写切面
 * @author 王关亮
 */

@Aspect
@Component
public class AspectJService {

    @Pointcut("@annotation(com.springmaven.aspectjinterface.Action)")
    public void annotationPointCut(){

    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截器" + action.name() + ",方法名：" + method.getName());
    }

    @Before("execution(* com.springmaven.service.aspectjservice.MethodService.* (..))")  //execution切入点表达式
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法式拦截器" + method.getName());
    }

}
