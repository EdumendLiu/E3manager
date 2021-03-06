//package com.lyb.content.service.impl;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import com.lyb.content.service.ContentCategoryService;
//import com.lyb.e3mall.common.pojo.EasyUITreeNode;
//import com.lyb.e3mall.common.utils.E3Result;
//import com.lyb.e3mall.dao.TbContentCategoryDao;
//import com.lyb.e3mall.entity.TbContentCategory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
///**
// * 内容分类管理Service
// * <p>Title: ContentCategoryServiceImpl</p>
// * <p>Description: </p>
// * <p>Company: www.itcast.cn</p>
// * @version 1.0
// */
//
//@Service
//public class ContentCategoryServiceImpl implements ContentCategoryService{
//
//	@Autowired
//	private TbContentCategoryDao contentCategoryMapper;
//	@Override
//	public List<EasyUITreeNode> getContentCatList(int parentId){
//		TbContentCategory tbContentCategory = new TbContentCategory();
//		tbContentCategory.setParentId(parentId);
//		List<TbContentCategory> catList = contentCategoryMapper.queryAll(tbContentCategory);
//		List<EasyUITreeNode> nodeList = new ArrayList<>();
//		for(TbContentCategory i : catList){
//			EasyUITreeNode node = new EasyUITreeNode();
//			node.setId(i.getId());
//			node.setText(i.getName());
//			node.setState(i.getIsParent()?"closed":"open");
//			nodeList.add(node);
//		}
//		return nodeList;
//	}
//
//	@Override
//	public E3Result addContentCategory(int parentId, String name){
//		//创建一个tb_content_category表对应的pojo对象
//		TbContentCategory contentCategory = new TbContentCategory();
//		//设置pojo的属性
//		contentCategory.setParentId(parentId);
//		contentCategory.setName(name);
//		//1(正常),2(删除)
//		contentCategory.setStatus(1);
//		//默认排序就是1
//		contentCategory.setSortOrder("1");
//		//新添加的节点一定是叶子节点
//		contentCategory.setIsParent(false);
//		contentCategory.setCreated(new Date());
//		contentCategory.setUpdated(new Date());
//		//插入到数据库
//		contentCategoryMapper.insert(contentCategory);
//		//判断父节点的isparent属性。如果不是true改为true
//		//根据parentid查询父节点
//		TbContentCategory parent = contentCategoryMapper.selectByPrimaryKey(parentId);
//		if (!parent.getIsParent()) {
//			parent.setIsParent(true);
//			//更新到数数据库
//			contentCategoryMapper.updateByPrimaryKey(parent);
//		}
//		//返回结果，返回E3Result，包含pojo
//		return E3Result.ok(contentCategory);
//	}
//
//}
