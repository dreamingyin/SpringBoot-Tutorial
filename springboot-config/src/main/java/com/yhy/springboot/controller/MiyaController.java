package com.yhy.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: MiyaController
 * @Author Steven
 * @Date: 2020/2/28
 */
@RestController
public class MiyaController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private String age;

    @RequestMapping(value = "miya")
    public String Miya(){
        return name+":"+age;
    }
}
