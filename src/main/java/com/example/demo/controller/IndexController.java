package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {



    @ResponseBody
    @RequestMapping("/id")
    public String getById(){

        return "1000";
    }
    @ResponseBody
    @RequestMapping("/index")
    public String index(){

        return "index";
    }
}
