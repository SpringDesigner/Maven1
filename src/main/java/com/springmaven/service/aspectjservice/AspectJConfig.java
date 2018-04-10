package com.springmaven.service.aspectjservice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.springmaven.service.aspectjservice")
@EnableAspectJAutoProxy  //开启Spring对AspectJ代理的支持
public class AspectJConfig {

}
