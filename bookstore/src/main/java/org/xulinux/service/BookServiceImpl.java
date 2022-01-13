package org.xulinux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xulinux.dao.BookMapper;
import org.xulinux.pojo.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    @Override
    public List<Book> queryBookList(Map map) {
        return this.bookMapper.queryBookList(map);
    }

    @Override
    public List<Book> queryBookList(int offset, int limit) {
        Map map = new HashMap();
        map.put("offset",offset);
        map.put("limit",limit);


        return this.bookMapper.queryBookList(map);
    }

    @Override
    public List<Book> queryBookList(int offset, int limit, String name) {
        Map map = new HashMap();
        map.put("offset",offset);
        map.put("limit",limit);
        map.put("name",name);

        return this.bookMapper.queryBookList(map);
    }
}

// 添加其他业务只需通过aop即可
