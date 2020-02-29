package com.yhy.springboot.controller;

import com.yhy.springboot.bean.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @FileName: JpaController
 * @Author Steven
 * @Date: 2020/2/29
 */
@RestController
public class JpaController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * @return
     * 查询全部信息
     */
    @RequestMapping("/list")
    public List<Map<String, Object>> itemsList() {
        String sql = "select * from items";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        return list;
    }

    /**
     * @param id
     * @return
     * 根据ID查询单条信息
     */
    @RequestMapping("/detail/{id}")
    public Map<String, Object> detail(@PathVariable int id) {
        Map<String, Object> map = null;
        List<Map<String, Object>> list = itemsList();
        map = list.get(id);
        return map;
    }

    /**
     * 新增数据
     * @param items
     * @return
     */
    @RequestMapping("/add")
    public @ResponseBody String  addItems(Items items) {
        String sql = "insert into items (id,title,name,detail) value (?,?,?,?)";
        Object args[] = {items.getId(),items.getTitle(),items.getName(),items.getDetail()};
        int temp = jdbcTemplate.update(sql, args);
        if(temp > 0) {
            return "文章新增成功";
        }
        return "新增出现错误";
    }

    /**
     * @param items
     * @return
     * 删除数据
     */
    @RequestMapping("/del")
    public @ResponseBody String  delItems(Items items) {
        String sql = "delete from items where id = ?";
        Object args[] = {items.getId()};
        int temp = jdbcTemplate.update(sql, args);
        if(temp > 0) {
            return "文章删除成功";
        }
        return "删除出现错误";
    }

    /**
     * @param items
     * @return
     * 更新操作
     */
    @RequestMapping("/upd")
    public @ResponseBody
    String  updItems(Items items) {
        String sql = "update items set title = ?,detail = ? where id = ?";
        Object args[] = {items.getTitle(),items.getDetail(),items.getId()};
        int temp = jdbcTemplate.update(sql, args);
        if(temp > 0) {
            return "文章修改成功";
        }
        return "修改出现错误";
    }


}
