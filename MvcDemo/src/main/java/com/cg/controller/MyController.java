package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController 
{
	@RequestMapping("first")
public String firstpage()
{
	return "index.jsp";
}
	
	
	
	
	@RequestMapping("second")
	public String secondpage()
	{
		return "index.jsp";
	}
}
