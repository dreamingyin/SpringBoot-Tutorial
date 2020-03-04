package com.yhy.springboot.service;

import com.yhy.springboot.bean.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @FileName: CustomerRepository
 * @Author Steven
 * @Date: 2020/3/4
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);
}
