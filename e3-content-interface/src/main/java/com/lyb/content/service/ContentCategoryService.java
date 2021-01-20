package com.lyb.content.service;

import com.lyb.e3mall.common.pojo.EasyUITreeNode;
import com.lyb.e3mall.common.utils.E3Result;

import java.util.List;

public interface ContentCategoryService {

	List<EasyUITreeNode> getContentCatList(int parentId);

	E3Result addContentCategory(int parentId,String name);

}
