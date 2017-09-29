package com.wangcj.controller.service;

import com.wangcj.pojo.Item;

public interface ItemService {

	/**
	 * 根据id 查询学生姓名
	 * @param id
	 * @return
	 */
	public Item findItemById(long id);
	
	/**
	 * 根据name  查询学生的id
	 * @param name
	 * @return
	 */
	public Item findItemByName(String name);
}
