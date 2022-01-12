package org.xulinux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xulinux.dao.BookMapper;

import java.util.logging.Logger;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/10 下午3:57
 */
@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookMapper bookMapper;

    public BookServiceImpl() {
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public BookMapper getBookMapper() {
        return bookMapper;
    }
}

// 添加其他业务只需通过aop即可
