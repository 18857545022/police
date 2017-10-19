package com.police.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/index1")
	public String toIndex(){
		return "index1";
	}
}
