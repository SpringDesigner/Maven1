package com.springmaven.service.scopeservice;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") //描述Spring容器如何新建Bean,默认为singleton,prototype:每次调用新建一个Bean实例
public class PrototypeService {

}
