package cn.snake;

import cn.snake.dao.ItemsDao;
import cn.snake.service.ItemService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void testDao(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemsDao dao = context.getBean(ItemsDao.class);

        System.out.println(dao.findItemById(1));
    }

    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ItemService service = context.getBean(ItemService.class);

        System.out.println(service.findById(1));
    }
}
