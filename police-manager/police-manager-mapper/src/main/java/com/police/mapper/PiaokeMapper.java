package com.police.mapper;

import java.util.List;

import com.police.pojo.PiaokePojo;
public interface PiaokeMapper {

	int save(PiaokePojo piaoke);
	
	List<PiaokePojo> get_hour();
	
	List<PiaokePojo> getPiaokeByZjhm(String zjhm);
	
	List<String> getZjhm_hour_count();
	
	List<String> getZjhm_month_count(int month);
	
	List<String> getZjhm_month(String month);
	
	List<PiaokePojo> getNewByZjhm(int month,String zjhm);
	
	String getMessageByTypeAndZjhm(int month,String zjhm,int type);
	
}
