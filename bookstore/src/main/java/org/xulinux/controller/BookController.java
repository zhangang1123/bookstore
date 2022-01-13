package org.xulinux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @RequestMapping(value = "/{offset}/{limit}",method = RequestMethod.GET)
    public String getBookList(@PathVariable("offset") int offset,@PathVariable("limit") int limit) {
        List<Book> books = this.bookService.queryBookList(offset,limit);

        return Util.getGson().toJson(books);
    }



    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

}
