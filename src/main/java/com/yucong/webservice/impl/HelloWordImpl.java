package com.yucong.webservice.impl;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.yucong.webservice.HelloWordI;

@Component
@WebService(endpointInterface = "com.yucong.webservice.HelloWordI")
public class HelloWordImpl implements HelloWordI {
    @Override
    public String say(@WebParam(name = "str") String str) {
        System.out.println("=======webservice调用成功!!!======");
        return "Hello:  " + str;
    }
}
