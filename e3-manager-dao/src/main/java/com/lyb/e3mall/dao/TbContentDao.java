package com.lyb.e3mall.dao;


import com.lyb.e3mall.entity.TbContent;
import com.lyb.e3mall.entity.TbContentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbContentDao {
    int countByExample(TbContent example);

    int deleteByExample(TbContent example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContent record);

    int insertSelective(TbContent record);

    List<TbContent> selectByExampleWithBLOBs(TbContentExample example);

    List<TbContent> selectByExample(TbContent example);

    TbContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbContent record, @Param("example") TbContent example);

    int updateByExampleWithBLOBs(@Param("record") TbContent record, @Param("example") TbContent example);

    int updateByExample(@Param("record") TbContent record, @Param("example") TbContent example);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKeyWithBLOBs(TbContent record);

    int updateByPrimaryKey(TbContent record);
}
