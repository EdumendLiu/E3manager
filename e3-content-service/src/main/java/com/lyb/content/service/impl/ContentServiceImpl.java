package com.lyb.content.service.impl;

import java.util.Date;
import java.util.List;

import com.lyb.content.service.ContentService;
import com.lyb.e3mall.common.jedis.JedisClient;
import com.lyb.e3mall.common.utils.E3Result;
import com.lyb.e3mall.common.utils.JsonUtils;
import com.lyb.e3mall.dao.TbContentDao;
import com.lyb.e3mall.entity.TbContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


/**
 * 内容管理Service
 * <p>Title: ContentServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p>
 * @version 1.0
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private TbContentDao contentMapper;
	@Autowired
	private JedisClient jedisClient;

	@Value("${CONTENT_LIST}")
	private String CONTENT_LIST;

	@Override
	public E3Result addContent(TbContent content) {
		//将内容数据插入到内容表
		content.setCreated(new Date());
		content.setUpdated(new Date());
		//插入到数据库
		contentMapper.insert(content);
		//缓存同步,删除缓存中对应的数据。
		jedisClient.hdel(CONTENT_LIST, content.getCategoryId().toString());
		return E3Result.ok();
	}

	/**
	 * 根据内容分类id查询内容列表
	 * <p>Title: getContentListByCid</p>
	 * <p>Description: </p>
	 * @param cid
	 * @return
	 */
//	@Override
//	public List<TbContent> getContentListByCid(long cid) {
//		//查询缓存
//		try {
//			//如果缓存中有直接响应结果
//			String json = jedisClient.hget(CONTENT_LIST, cid + "");
//			if (StringUtils.isNotBlank(json)) {
//				List<TbContent> list = JsonUtils.jsonToList(json, TbContent.class);
//				return list;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		//如果没有查询数据库
//		TbContentExample example = new TbContentExample();
//		TbContentExample.Criteria criteria = example.createCriteria();
//		//设置查询条件
//		criteria.andCategoryIdEqualTo(cid);
//		//执行查询
//		List<TbContent> list = contentMapper.selectByExampleWithBLOBs(example);
//		//把结果添加到缓存
//		try {
//			jedisClient.hset(CONTENT_LIST, cid + "", JsonUtils.objectToJson(list));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list;
//	}

}
