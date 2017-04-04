package com.opc.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zjbao on 2017/4/4.
 */
@RestController
@EnableAutoConfiguration

public class NewWorld {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello World~";
    }
}

