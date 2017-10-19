package com.police.mapper;

import java.util.List;

import com.police.pojo.Hotelguest;
import com.police.pojo.PiaokePojo;

public interface HotelguestMapper {
	/**获取到的人员证件号码List集合
	 * 条件:①一个月以内 
	 *     ②开房次数count次以上，
	 * @param count:动态次数设施
	 * @return List<String>:获取满足要求：①一个月以内 ②开房次数count次以上，获取到的人员证件号码List集合
	 */
	List<String> getZjhms_monthByCount(Integer count);
	
	List<String> getZjhms_hourByCount(int hour);
	
	List<Hotelguest> getKfjlByZjhm(String zjhm);
	
	List<Hotelguest> getKfjlByXb_M(int month);
	
	List<Hotelguest> getKfjlByXb_N(int month);
	
	List<Hotelguest> getKfjlByXb_N_beforeDay(int i);
	
	List<Hotelguest> getKfjlByXb_M_beforeDay(int i);
	
	List<Hotelguest> getKfjlByXb_M_beforeMonth(int i); 
	
	List<Hotelguest> getKfjlByXb_N_beforeMonth(int i);
	
	List<Hotelguest> getKfjlByXb_N_beforeHours(int hour);
	
	List<Hotelguest> getKfjlByXb_M_beforeHours(int hour);
}
