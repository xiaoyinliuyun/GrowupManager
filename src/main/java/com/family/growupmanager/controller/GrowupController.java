package com.family.growupmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GrowupController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
