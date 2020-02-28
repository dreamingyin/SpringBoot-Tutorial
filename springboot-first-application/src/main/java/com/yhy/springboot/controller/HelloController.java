package com.yhy.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: HelloController
 * @Author Steven
 * @Date: 2020/2/28
 */
@RestController
public class HelloController {

    @RequestMapping("SpringBoot")
    public String hello(){

        return "Hello SpringBoot Welcome";
    }

}
