package com.police.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.police.pojo.SqlPojo;
import com.police.pojo.YxkfPojo;

public interface YxkfMapper {
	
	int save(YxkfPojo yxkfPojo);
	
	List<String> getPk_zjhm_month(String month);
	
	List<String> getPk_zjhm_hour(int hour,int month);
	
	List<YxkfPojo> getYxkfByZjhm_month(int month,String zjhm);
	

}
