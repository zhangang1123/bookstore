package org.xulinux.dao;

import org.xulinux.pojo.Book;

import java.util.List;
import java.util.Map;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/10 下午3:45
 */
public interface BookMapper {
    public int addBook(Book book);
    public int deleteBook(int id);
    public int updateBook(Book book);
    public List<Book> queryBookList(Map map);
    public Book queryOneBook(int id);
    public List<Book> queryBooksByTag(int id);
}
