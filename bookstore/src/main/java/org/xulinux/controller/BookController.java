package org.xulinux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.xulinux.pojo.Book;
import org.xulinux.service.BookService;
import org.xulinux.util.Util;

import java.util.List;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/10 下午10:42
 */
@Controller
@ResponseBody
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    public String getBookList(@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
        List<Book> books = this.bookService.queryBookList(offset,limit);

        return Util.getGson().toJson(books);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String getOneBookById(@PathVariable("id") int id) {
        Book book = this.bookService.queryOneBook(id);

        return Util.getGson().toJson(book);
    }

    @RequestMapping(value = "/tags",method = RequestMethod.GET)
    public String getBooksByTag(@RequestParam("tagId") int tagId,@RequestParam("limit") int limit,@RequestParam("offset") int offset) {
        List<Book> books = this.bookService.getBooksByTag(tagId,offset,limit);
        return Util.getGson().toJson(books);
    }

    @RequestMapping(value = "/name/{name}",method = RequestMethod.GET)
    public String getBooksByName(@PathVariable("name") String name) {
        List<Book> books = this.bookService.queryBookList(0,100,name);

        return Util.getGson().toJson(books);
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

}
