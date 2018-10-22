package cn.snake.dao;

import cn.snake.entity.Items;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ItemsDao {
    @Select("select * from items where id = #{id}")
    Items findItemById(@Param("id")Integer id);
}
