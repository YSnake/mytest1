package cn.snake.service.impl;

import cn.snake.ItemService;
import cn.snake.dao.ItemsDao;
import cn.snake.entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemsDao itemDao;
    public Items findById(Integer id) {
        return itemDao.findItemById(id);
    }
}
