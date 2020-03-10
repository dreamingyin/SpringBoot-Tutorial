package com.yhy.spingboot.service.impl;

import com.yhy.spingboot.bean.Book;
import com.yhy.spingboot.service.BookService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

/**
 * @FileName: BookServiceImpl
 * @Author Steven
 * @Date: 2020/3/10
 */

@Component
public class BookServiceImpl implements BookService{


    @Override
    @Cacheable("books")
    public Book getByIsbn(String isbn) {
        simulateSlowService();

        return new Book(isbn,"Java Think");
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
