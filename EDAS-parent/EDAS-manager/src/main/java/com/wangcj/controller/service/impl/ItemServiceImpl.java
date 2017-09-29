package com.wangcj.controller.service.impl;



import org.springframework.beans.factory.annotation.Autowired;

import com.wangcj.controller.service.ItemService;
import com.wangcj.pojo.Item;


public class ItemServiceImpl implements ItemService{
	@Autowired
	private com.wangcj.service.ItemService itemService ;

	@Override
	public Item findItemById(long id) {
		return itemService.getItemById(id);
	}

	@Override
	public Item findItemByName(String name) {
		return itemService.getItemByName(name);
	}

}
