package com.yhy.springboot.controller;

import com.yhy.springboot.bean.ConfigBean;
import com.yhy.springboot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: LucyController
 * @Author Steven
 * @Date: 2020/2/28
 */
@RestController
@EnableConfigurationProperties(ConfigBean.class)
public class LucyController {

    @Autowired
    ConfigBean configBean;


    @RequestMapping("/lucy")
    public String Miya(){
        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
    }

    @Autowired
    User user;

    @RequestMapping("/user")
    public String user(){
        return user.getName()+":"+user.getAge();
    }
}
