package com.yhy.spingboot.service;

import com.yhy.spingboot.bean.Book;

/**
 * @FileName: BookService
 * @Author Steven
 * @Date: 2020/3/10
 */
public interface BookService {
    Book getByIsbn(String isbn);
}
