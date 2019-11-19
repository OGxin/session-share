package com.ozx.sessionshare.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @ClassName: SessionController
 * @Description:TODO
 * @Author ou.zhenxing
 * @Date 2019/11/18 16:16
 * @Version： 1.0
 **/
@RestController
public class SessionController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/set")
    public String setSession(HttpSession httpSession){
        httpSession.setAttribute("username","ozx");
        return port;
    }

    @GetMapping("/get")
    public String getSession(HttpSession httpSession){
        return httpSession.getAttribute("username")+"端口号："+port;
    }
}
