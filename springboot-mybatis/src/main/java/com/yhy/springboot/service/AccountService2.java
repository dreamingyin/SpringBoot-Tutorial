package com.yhy.springboot.service;

import com.yhy.springboot.mapper.AccountMapper;
import com.yhy.springboot.mapper.AccountMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @FileName: AccountService2
 * @Author Steven
 * @Date: 2020/2/29
 */
@Service
public class AccountService2 {

    @Autowired
    AccountMapper2 accountMapper2 ;

    @Transactional(rollbackFor = Exception.class)
    public void transfer() throws RuntimeException{
        //用户1减10块 用户2加10块
        accountMapper2.update(90,1);
        int i=1/0;
        accountMapper2.update(110,2);
    }

}
