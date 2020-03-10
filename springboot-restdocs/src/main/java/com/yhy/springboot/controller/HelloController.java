package com.yhy.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * @FileName: HelloController
 * @Author Steven
 * @Date: 2020/3/10
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public Map<String,Object> helloController(){
        return Collections.singletonMap("message","Hello World");
    }
}
