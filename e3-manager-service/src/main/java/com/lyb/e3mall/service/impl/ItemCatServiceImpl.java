package com.lyb.e3mall.service.impl;

import com.lyb.e3mall.common.pojo.EasyUITreeNode;

import com.lyb.e3mall.dao.TbItemCatDao;
import com.lyb.e3mall.entity.TbItemCat;
import com.lyb.e3mall.entity.TbItemCatExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/***
 * 商品分类管理
 *
 */
@Service("ItemCatService")
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private TbItemCatDao itemCatMapper;
    @Override
    public List<EasyUITreeNode> getItemCatlist(long parentId)
    {
//        //根据parentID来查询子节点列表
//        TbItemCatExample example =new TbItemCatExample();
//        TbItemCatExample.Criteria criteria=example.createCriteria();
//        //设置查询条件
//        criteria.andParentIdEqualTo(parentId);
        TbItemCat tbItemCat =new TbItemCat();
        tbItemCat.setParentId(parentId);
        //执行查询
        List<TbItemCat> list =itemCatMapper.queryAll(tbItemCat);
        //创建返回结果List
        List<EasyUITreeNode> resultList =new ArrayList<>();
        //把列表转化成EasyUITreeNode列表
        for (TbItemCat i : list){
            EasyUITreeNode node =new EasyUITreeNode();
            node.setId(i.getId());
            node.setText(i.getName());
            //三目表达式 前面真假决定值，tbItemCat.getIsParent()应该是boolean，这里为何是integer
            node.setState(i.getIsParent()? "closed":"open");

            resultList.add(node);
        }
        //返回结果
        return resultList;


    }
}
