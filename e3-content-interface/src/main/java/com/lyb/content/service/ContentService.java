package com.lyb.content.service;

import com.lyb.e3mall.common.utils.E3Result;
import com.lyb.e3mall.entity.TbContent;

import java.util.List;



public interface ContentService {

	E3Result addContent(TbContent content);
	List<TbContent> getContentListByCid(long cid);
}
