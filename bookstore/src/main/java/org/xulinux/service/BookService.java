package org.xulinux.service;

import org.xulinux.pojo.Book;

import java.util.List;
import java.util.Map;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/10 下午3:56
 */
public interface BookService {
    public List<Book> queryBookList(Map map);
    public List<Book> queryBookList(int offset,int limit);
    public List<Book> queryBookList(int offset,int limit,String name);
}
