package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/main")
@Controller
public class MainController {
    @RequestMapping("/getLogin")
    public String getLogin(){
        return "login";
    }
    @RequestMapping("/toList")
    public String toList(){
        return "user_list";
    }
    @RequestMapping("/tode")
    public String tode(){
        return "deposit_list";
    }
}
