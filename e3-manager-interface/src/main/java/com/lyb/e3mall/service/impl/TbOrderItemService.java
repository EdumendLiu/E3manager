package com.lyb.e3mall.service.impl;

import com.lyb.e3mall.entity.TbOrderItem;

import java.util.List;

/**
 * (TbOrderItem)表服务接口
 *
 * @author makejava
 * @since 2020-12-07 18:34:56
 */
public interface TbOrderItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
//    TbOrderItem queryById(int id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbOrderItem> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbOrderItem 实例对象
     * @return 实例对象
     */
    TbOrderItem insert(TbOrderItem tbOrderItem);

    /**
     * 修改数据
     *
     * @param tbOrderItem 实例对象
     * @return 实例对象
     */
//    TbOrderItem update(TbOrderItem tbOrderItem);

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    boolean deleteById();

}
