package com.ttb.apiserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

    @RequestMapping("/test")
    public String test() {
        return "kkkk";
    }

}
