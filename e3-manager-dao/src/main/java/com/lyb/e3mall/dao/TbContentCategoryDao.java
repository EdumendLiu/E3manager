package com.lyb.e3mall.dao;



import com.lyb.e3mall.entity.TbContentCategory;

import java.util.List;

public interface TbContentCategoryDao {


    TbContentCategory selectByPrimaryKey(int id);

    List<TbContentCategory> queryAll(TbContentCategory tbContentCategory);

    int insert(TbContentCategory record);

    int insertSelective(TbContentCategory record);

    int updateByPrimaryKey(TbContentCategory record);
}
