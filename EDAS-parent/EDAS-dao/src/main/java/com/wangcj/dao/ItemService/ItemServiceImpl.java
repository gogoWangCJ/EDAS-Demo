package com.wangcj.dao.ItemService;

import java.util.HashMap;

import java.util.Map;

import com.wangcj.pojo.Item;
import com.wangcj.service.ItemService;

public class ItemServiceImpl implements ItemService{

	
	
	/**
	 * 根据id 查询学生
	 */
	@Override
	public Item getItemById(long id) {
		Item item = new Item(1, "zhangsan", 20);
		
		return item ;
	}

	/**
	 * 根据nema  查询学生
	 */
	@Override
	public Item getItemByName(String name) {
		Item item = new Item();
		item.setIid(2);
		item.setIage(22);
		if("edas".equals(name)){
			item.setIname("入力参数    ： string");
		}else {
			item.setIname("入力参数    ： 有误");
		}
		
		return item;
	}

	
}
