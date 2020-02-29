package com.yhy.springboot.service;

import com.yhy.springboot.bean.Account;

import java.util.List;

/**
 * @FileName: AccountService
 * @Author Steven
 * @Date: 2020/2/28
 */
public interface AccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}
