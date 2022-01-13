import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xulinux.dao.BookMapper;
import org.xulinux.dao.ManagerMapper;
import org.xulinux.dao.TagMapper;
import org.xulinux.pojo.Book;
import org.xulinux.pojo.Manager;
import org.xulinux.pojo.Tag;
import org.xulinux.util.Util;

import java.util.HashMap;
import java.util.Map;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/12 下午6:30
 */
public class Test {

    @org.junit.Test
    public void testForMybaties() {
        ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("/applicationContext.xml");
//
        BookMapper bookMapper = applicationContext.getBean(BookMapper.class);
//        Book book = new Book();
//        book.setId(3);
//        book.setName("thinking in java");
//        book.setDownloads(3);
//        bookMapper.updateBook(book);
//        TagMapper tagMapper = applicationContext.getBean(TagMapper.class);
//        Tag tag = new Tag();
//        tag.setName("haode");
//        tag.setId(1);
//        tagMapper.updateTag(tag);

//        TagMapper tagMapper = applicationContext.getBean(TagMapper.class);
//
////        tagMapper.deteteTag(1);
//
//        tagMapper.addTag(tag);
//        tagMapper.addTag(tag);
//        tagMapper.addTag(tag);
//        System.out.println(tagMapper.queryTag());

        Map map = new HashMap();
        map.put("offset",0);
        map.put("limit",5);

        System.out.println(bookMapper.queryBookList(map));
    }
}
