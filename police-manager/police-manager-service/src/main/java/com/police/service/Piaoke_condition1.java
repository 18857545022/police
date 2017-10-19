package com.police.service;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.police.mapper.HotelguestMapper;
import com.police.mapper.PiaokeMapper;
import com.police.pojo.Hotelguest;
import com.police.pojo.PiaokePojo;
@Service("piaoke_condition1")
public class Piaoke_condition1 {
	@Autowired
	private HotelguestMapper hotelguestMapper;
	@Autowired
	private PiaokeMapper piaokeMapper;
	//处理历史嫖客
	
	
	public void workBypiaoke_count_init(Integer count){
		//获取一个月开房count次的证件号码(zjhm)集合
		List<String> list = hotelguestMapper.getZjhms_monthByCount(count);
		save_piaoke(list);
	}
	
	
	//处理实时(1小时内)嫖客
	public void workBypiaoke_count_hour(Integer count,Integer hour){
		//获取嫖客表
		List<String> m = hotelguestMapper.getZjhms_monthByCount(count);
		//获取1小时内开房人员
		List<String> n = hotelguestMapper.getZjhms_hourByCount(hour);
		List<String> list=new ArrayList<String>();
		//对比,筛选
		for(String str_m:m){
			boolean flag=false;
			for(String str_n:n){
				if(str_m.equals(str_n)){
					flag=true;
					break;
				}
			}
			if(flag){
				list.add(str_m);
			}
		}
		//根据对应嫖客,进行数据的更新
		//System.out.println(list.toString());
		save_piaoke(list);
	}

	
	//遍历zjhm集合根据zjhm一一对应查询获取数据集合
	public void save_piaoke(List<String> list){
				for(String zjhm:list){
					PiaokePojo piaoke = new PiaokePojo();
					//便利对应数据集合,拼凑每条记录的流水号
					List<Hotelguest> kfjlByZjhm = hotelguestMapper.getKfjlByZjhm(zjhm);
					List<String> list2 = new ArrayList<String>();
					for(int i=0;i<kfjlByZjhm.size();i++){
						if(i==0){
							piaoke.setId(0);
							piaoke.setCjsj(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
							piaoke.setXm(kfjlByZjhm.get(i).getXm());
							piaoke.setZjhm(kfjlByZjhm.get(i).getZjhm());
							piaoke.setLast_fh(kfjlByZjhm.get(i).getFh());
							piaoke.setLast_lgbm(kfjlByZjhm.get(i).getLgbm());
							piaoke.setLast_lgmc(kfjlByZjhm.get(i).getLgmc());
							piaoke.setZz(kfjlByZjhm.get(i).getZz());
							piaoke.setXb(kfjlByZjhm.get(i).getXb());
							piaoke.setMz(kfjlByZjhm.get(i).getMz());
							piaoke.setCsrq(kfjlByZjhm.get(i).getCsrq());
							piaoke.setZjlx(kfjlByZjhm.get(i).getZjlx());
							piaoke.setJg(kfjlByZjhm.get(i).getJg());
							piaoke.setType(1);
						}
						String zklsh=kfjlByZjhm.get(i).getZklsh();
						list2.add(zklsh);
					}
					piaoke.setMessage(list2.toString());
					//存储到新的表中
					//System.out.println(piaoke.toString());
					piaokeMapper.save(piaoke);
					
				}
					
	}
}
