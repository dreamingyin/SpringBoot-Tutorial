package com.yhy.springboot.controller;

import com.yhy.springboot.bean.Account;
import com.yhy.springboot.service.AccountService;
import com.yhy.springboot.service.AccountService2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @FileName: AccountController
 * @Author Steven
 * @Date: 2020/2/29
 */
@RestController
public class AccountController2 {

    @Autowired
    AccountService2 accountService2;

    @GetMapping(value = "transfer")
    public void transfer(){
        accountService2.transfer();
    }
}
