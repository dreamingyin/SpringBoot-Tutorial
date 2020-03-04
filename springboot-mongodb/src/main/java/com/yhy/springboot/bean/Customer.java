package com.yhy.springboot.bean;

import org.springframework.data.annotation.Id;

/**
 * @FileName: Customer
 * @Author Steven
 * @Date: 2020/3/4
 */
public class Customer {
    @Id
    public String id;

    public String firstName;
    public String lastName;

    public Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}

