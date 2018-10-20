package com.qgx.demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 *@Author: goxcheer
 *@Date:19:00 2018/10/20
 *@email:604721660@qq.com
 *@decription: springboot整合jsp,测试Controller
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Map<String,Object> map) {
        map.put("msg", "hello goxcheer!");
        return "hello";
    }
}
