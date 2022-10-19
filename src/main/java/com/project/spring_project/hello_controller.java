package com.project.spring_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hello_controller {
    @RequestMapping("/hello")
    @ResponseBody
    public String greetings(){
        return "HELLO";
    }
}
