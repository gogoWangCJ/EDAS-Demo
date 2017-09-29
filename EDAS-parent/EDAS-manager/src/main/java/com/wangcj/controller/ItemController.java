package com.wangcj.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangcj.controller.service.ItemService;
import com.wangcj.pojo.Item;

@Controller
public class ItemController {

	@Autowired
	private ItemService  itemservice ;
	
	
	@RequestMapping("/findid/{variable}")
	@ResponseBody
	public String login(@PathVariable("variable")String variable ){
		System.out.println("打印传递参数" + variable);
		if("1".equals(variable)){
			Item item = itemservice.findItemById(Integer.parseInt(variable));
		}else {
			Item item = itemservice.findItemByName(variable);
		}
		return "";
	}
}
