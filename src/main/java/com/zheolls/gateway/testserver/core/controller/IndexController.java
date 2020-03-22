package com.zheolls.gateway.testserver.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("AAAA");
        return "Gateway Test";
    }
    @RequestMapping("/view")
    public String view(){
        System.out.printf("TEST");
        return "view.html";
    }

}