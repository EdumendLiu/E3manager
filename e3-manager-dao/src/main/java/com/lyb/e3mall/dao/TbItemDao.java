package com.lyb.e3mall.dao;
import java.util.List;

import com.lyb.e3mall.entity.TbItem;
import com.lyb.e3mall.entity.TbItemExample;
import org.apache.ibatis.annotations.Param;

public interface TbItemDao {


    List<TbItem> queryAll(TbItem example);
    int insert(TbItem record);

}
