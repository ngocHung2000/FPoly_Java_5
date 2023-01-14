package com.hangnt169.it17203.B1_OverviewSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

//    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @GetMapping("/test")
    public String helloWord(Model model){
        //  code
        model.addAttribute("mess","Hello world");
        return "hello";
    }
}
