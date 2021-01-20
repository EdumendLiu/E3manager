package com.lyb.e3mall.service.impl;

import com.lyb.e3mall.entity.TbItemDesc;

import java.util.List;

/**
 * (TbItemDesc)表服务接口
 *
 * @author makejava
 * @since 2020-12-07 18:34:46
 */
public interface TbItemDescService {

    /**
     * 通过ID查询单条数据
     *
     * @param itemId 主键
     * @return 实例对象
     */
    TbItemDesc queryById(Integer itemId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbItemDesc> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbItemDesc 实例对象
     * @return 实例对象
     */
    TbItemDesc insert(TbItemDesc tbItemDesc);

    /**
     * 修改数据
     *
     * @param tbItemDesc 实例对象
     * @return 实例对象
     */
    TbItemDesc update(TbItemDesc tbItemDesc);

    /**
     * 通过主键删除数据
     *
     * @param itemId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer itemId);

}
