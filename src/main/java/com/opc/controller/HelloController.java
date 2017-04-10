package com.opc.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjbao on 2017/4/4.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {

        return "index";
    }

}

