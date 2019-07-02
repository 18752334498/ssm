package com.yucong.webservice;

import javax.jws.WebService;

@WebService
public interface HelloWordI {
    public String say(String str);
}
