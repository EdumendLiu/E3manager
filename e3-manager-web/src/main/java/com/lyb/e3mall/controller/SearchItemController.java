package com.lyb.e3mall.controller;

import com.lyb.e3mall.common.utils.E3Result;
import com.lyb.e3mall.search.service.SearchItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 导入商品到索引库
 */
@Controller
public class SearchItemController {
    @Autowired
    private SearchItemService searchItemService;

    @RequestMapping("/index/item/import")
    @ResponseBody
    public E3Result impprtItemList(){
        E3Result e3Result = searchItemService.importAllItems();
        return e3Result;
    }
}
