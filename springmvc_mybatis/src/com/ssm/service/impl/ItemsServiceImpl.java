package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.mapper.ItemsMapperCustom;
import com.ssm.pojo.ItemsCustom;
import com.ssm.pojo.ItemsQueryVo;
import com.ssm.service.ItemsService;

public class ItemsServiceImpl implements ItemsService{
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

}
