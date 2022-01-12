import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xulinux.dao.ManagerMapper;
import org.xulinux.pojo.Book;
import org.xulinux.pojo.Manager;
import org.xulinux.util.Util;

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

        ManagerMapper managerMapper = applicationContext.getBean(ManagerMapper.class);

        System.out.println(managerMapper);
        Manager manager = new Manager();
        manager.setPassword("fdsfsd");
        manager.setName("fsdfsd");

        System.out.println(managerMapper.addManager(manager));
    }
}
