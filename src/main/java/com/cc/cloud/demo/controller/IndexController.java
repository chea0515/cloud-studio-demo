package com.cc.cloud.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloud/demo/index")
public class IndexController {

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String index(@PathVariable String name) {
        return "name is :" + name;
    }
}
