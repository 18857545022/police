package com.police.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.police.pojo.PiaokePojo;
import com.police.service.PiaokeService;

@Controller
public class PiaokeController {
	
	@Autowired
	private PiaokeService piaokeService;
	
	@RequestMapping(value = "/getNewPiaoke",produces = "application/json;charset=utf-8")  
	@ResponseBody
	public Set<PiaokePojo> getPiaoke_new(){
		Set<PiaokePojo> set = piaokeService.getPiaoke_hour();
		return set;
	}
	
	
	@RequestMapping(value = "/getHistoryPiaoke",produces = "application/json;charset=utf-8")  
	@ResponseBody
	public Set<PiaokePojo> getPiaoke_history(){
		 Set<PiaokePojo> set = piaokeService.getPiaoke_month(3);
		return set;
	}
}
