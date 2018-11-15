package com.cc.cloud.demo.controller;

@Controller
@RequestMapping("/cloud/demo/index")
public class IndexController {

    @RequestMapping(value="", method=RequestMethod.GET)
    public String index() {
        System.out.println("test->controller");
    }
}