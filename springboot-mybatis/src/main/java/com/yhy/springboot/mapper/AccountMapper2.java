package com.yhy.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @FileName: AccountMapper2
 * @Author Steven
 * @Date: 2020/2/29
 */
@Component
@Mapper
public interface AccountMapper2 {
    int update(@Param("money") double money, @Param("id") int  id);
}
