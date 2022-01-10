package org.xulinux.service;

import org.xulinux.dao.BookMapper;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/10 下午3:57
 */
public class BookServiceImpl implements BookService{
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
