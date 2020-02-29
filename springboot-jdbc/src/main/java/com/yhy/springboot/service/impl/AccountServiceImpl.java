package com.yhy.springboot.service.impl;

import com.yhy.springboot.bean.Account;
import com.yhy.springboot.mapper.AccountMapper;
import com.yhy.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @FileName: AccountServiceImpl
 * @Author Steven
 * @Date: 2020/2/29
 */
@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountMapper accountMapper;
    @Override
    public int add(Account account) {
        return accountMapper.add(account);
    }

    @Override
    public int update(Account account) {
        return accountMapper.update(account);
    }

    @Override
    public int delete(int id) {
        return accountMapper.delete(id);
    }

    @Override
    public Account findAccountById(int id) {
        return accountMapper.findAccountById(id);
    }

    @Override
    public List<Account> findAccountList() {
        return accountMapper.findAccountList();
    }

}
