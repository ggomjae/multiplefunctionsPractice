package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class practiceController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/index")
    public String testMethod(){
        int y;
        y = 3;

        int x;
        x = 3;
        logger.info("하이욥" + x + y);
        return "index";
    }
}
