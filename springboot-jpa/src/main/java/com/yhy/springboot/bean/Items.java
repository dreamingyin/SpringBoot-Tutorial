package com.yhy.springboot.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @FileName: Items
 * @Author Steven
 * @Date: 2020/2/29
 */
public class Items implements Serializable{

    private Integer id;
    private String title;
    private String name;
    private String detail;

    public Items(Integer id, String title, String name, String detail) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                '}';
    }
}
