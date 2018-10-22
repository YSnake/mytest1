package cn.snake.controller;

import cn.snake.ItemService;
import cn.snake.entity.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {
    @Autowired
    ItemService itemService;
    @RequestMapping("/getDetail")
    public String getDetail(Model model){
        Items item = itemService.findById(1);
        model.addAttribute("item",item);
        return "itemDetail";
    }
}
