package com.demo.springBoot.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.springBoot.dao.AddDAO;
import com.demo.springBoot.model.ItemDTO;

@Controller
public class ItemController 
{
	@Autowired
	private AddDAO dao;
	
	@RequestMapping("/")
	public String home()
	{
		
		return "home.jsp";
	}
	
	@RequestMapping("/addItem")
	public String addItem(ItemDTO dto)
	{
		dao.save(dto);
		return "home.jsp";
	}
	
	@RequestMapping("/items")
	@ResponseBody
	public List<ItemDTO> viewItem()
	{
		 List<ItemDTO> items = dao.findAll();
	        return items.stream().sorted((item1, item2) -> Double.compare(item2.getPrice(), item1.getPrice()))
	            .collect(Collectors.toList());
		
	}
}
