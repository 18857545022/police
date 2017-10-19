package com.police.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.police.service.Piaoke_condition1;

@Controller
public class setTimeWorkController {
	
	@Autowired
	private Piaoke_condition1 piaoke_condition1;
	
	@ResponseBody
	@RequestMapping("/condition1")
	public String getComminBycondition(@RequestParam Integer count){
		//String str = piaoke_condition1.workBypiaoke_count_init(count);
		System.out.println("a");
		return "a";
	}
	
}
