package com.lyb.e3mall.service.impl;

import com.lyb.e3mall.common.pojo.EasyUIDataGridResult;
import com.lyb.e3mall.common.utils.E3Result;
import com.lyb.e3mall.entity.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EasyUIDataGridResult getItemList(int page, int rows);
	//添加商品
	E3Result addItem(TbItem item, String desc);
}
