package com.springmaven.service.aspectjservice;

import com.springmaven.aspectjinterface.Action;
import org.springframework.stereotype.Service;

/**
 * 使用注解被拦截类
 */
@Service
public class AnnotationService {

    @Action(name="注解式拦截器")
    public void add(){

    }

}
