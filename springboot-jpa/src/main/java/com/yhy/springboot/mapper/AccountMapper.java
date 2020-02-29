package com.yhy.springboot.mapper;

import com.yhy.springboot.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @FileName: AccountMapper
 * @Author Steven
 * @Date: 2020/2/29
 */
public interface AccountMapper extends JpaRepository<Account,Integer>{
}
