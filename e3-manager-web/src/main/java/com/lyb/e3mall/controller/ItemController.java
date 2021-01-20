package com.lyb.e3mall.controller;

import com.lyb.e3mall.common.pojo.EasyUIDataGridResult;
import com.lyb.e3mall.common.utils.E3Result;
import com.lyb.e3mall.entity.TbItem;
import com.lyb.e3mall.service.impl.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 商品管理Controller
 */
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable int itemId){
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem;
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows){
        //调用服务查询商品列表
        EasyUIDataGridResult result = itemService.getItemList(page, rows);
        return result;
    }
    /**
     * 商品添加功能
     */
    @RequestMapping(value="/item/save", method= RequestMethod.POST)
    @ResponseBody
    public E3Result addItem(TbItem item, String desc) {
        E3Result result = itemService.addItem(item, desc);
        return result;
    }
}
