package com.ssm.service;

import java.util.List;

import com.ssm.pojo.ItemsCustom;
import com.ssm.pojo.ItemsQueryVo;

public interface ItemsService {
	//商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
