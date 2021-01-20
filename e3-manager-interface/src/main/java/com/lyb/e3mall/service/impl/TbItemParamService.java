package com.lyb.e3mall.service.impl;

import com.lyb.e3mall.entity.TbItemParam;

import java.util.List;

/**
 * (TbItemParam)表服务接口
 *
 * @author makejava
 * @since 2020-12-07 18:34:48
 */
public interface TbItemParamService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbItemParam queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbItemParam> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbItemParam 实例对象
     * @return 实例对象
     */
    TbItemParam insert(TbItemParam tbItemParam);

    /**
     * 修改数据
     *
     * @param tbItemParam 实例对象
     * @return 实例对象
     */
    TbItemParam update(TbItemParam tbItemParam);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
