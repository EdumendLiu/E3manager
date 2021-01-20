package com.lyb.e3mall.service.impl;



import com.lyb.e3mall.common.pojo.EasyUITreeNode;

import java.util.List;



public interface ItemCatService {

	List<EasyUITreeNode> getItemCatlist(long parentId);
}
