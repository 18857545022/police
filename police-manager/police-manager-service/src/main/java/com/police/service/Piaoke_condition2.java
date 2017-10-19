package com.police.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.police.mapper.HotelguestMapper;
import com.police.mapper.PiaokeMapper;
import com.police.mapper.YxkfMapper;
import com.police.pojo.Hotelguest;
import com.police.pojo.PiaokePojo;
import com.police.pojo.SqlPojo;
import com.police.pojo.YxkfPojo;

@Service
public class Piaoke_condition2 {
	@Autowired
	private HotelguestMapper hotelguestMapper;
	
	@Autowired
	private YxkfMapper yxkfMapper;
	
	@Autowired
	private PiaokeMapper piaokeMapper;

	/**
	 * 根据历史异性开房记录,存储历史嫖客记录
	 * @param month 
	 * @return
	 */
	public void workBypiaoke_yx_init(int month){//初始化存储历史嫖客
		//获取嫖客证件号码,要求:month月内与2名以上异性开房
		List<String> pk_list = yxkfMapper.getPk_zjhm_month(""+month);
		for(String zjhm:pk_list){
			//获取嫖客month月内开房记录
			List<YxkfPojo> list = yxkfMapper.getYxkfByZjhm_month(month,zjhm);
			savePiaoke_yx(list);
		}
		//存储到piaoke表
	}
	
	/**
	 * hour小时异性开房记录更新 默认hour为1
	 * @param hour
	 * @return
	 */
	public void saveYxkf_hour(int hour){
		List<Hotelguest>  xb_N= hotelguestMapper.getKfjlByXb_N_beforeHours(hour);
		List<Hotelguest>  xb_M= hotelguestMapper.getKfjlByXb_N_beforeHours(hour);
		mateAndSaveyxkf(xb_M, xb_N);
	}
	
	/**
	 * hour小时内开房嫖客信息更新 默认hour为1
	 * @param month 嫖客定义标准：几个月内与2名异性开房
	 * @param hour 查找hour小时内开房嫖客数据
	 * @return
	 */
	public void workBypiaoke_yx_hour(int month,int hour){//实时更新嫖客记录(每小时更新一次)
		//获取嫖客证件号码,要求:month月内与2名以上异性开房
				List<String> pk_list = yxkfMapper.getPk_zjhm_hour(hour,month);
				System.out.println(pk_list.toString());
				for(String zjhm:pk_list){
					//如果嫖客1小时内有异性开房记录,存储最新month月内开房记录
					List<YxkfPojo> list = yxkfMapper.getYxkfByZjhm_month(month,zjhm);
					//System.out.println(list.toString());
					savePiaoke_yx(list);
				}
				//存储到piaoke表
	}
	
	/**
	 * 将数据赋值给piaoke类,然后进行save存储到piaoke表中
	 * param:list<YxkfPojo>
	 * @param list
	 */
	private void savePiaoke_yx(List<YxkfPojo> list){
		//进行数据封装
		PiaokePojo piaoke = new PiaokePojo();
		List<Map>message=new ArrayList<Map>();
		for(int i=0;i<list.size();i++){
			//System.out.println(list.get(i).getXm());
			if(i==0){
				piaoke.setId(0);
				piaoke.setCjsj(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
				piaoke.setXm(list.get(i).getXm());
				piaoke.setLast_fh(list.get(i).getFh());
				piaoke.setLast_lgbm(list.get(i).getLgbm());
				piaoke.setLast_lgmc(list.get(i).getLgmc());
				piaoke.setZjhm(list.get(i).getZjhm());
				piaoke.setZz(list.get(i).getZz());
				piaoke.setXb(list.get(i).getXb());
				piaoke.setMz(list.get(i).getMz());
				piaoke.setCsrq(list.get(i).getCsrq());
				piaoke.setZjlx(list.get(i).getZjlx());
				piaoke.setJg(list.get(i).getJg());
				piaoke.setType(2);
			}
			//判断message中是否有数据
			if(message.isEmpty()){
				Map<String, Object> map=new HashMap<String, Object>();
				map.put("xm", list.get(i).getYx_xm());
				map.put("count", 1);
				map.put("kfjl", list.get(i).getYx_zklsh());
				message.add(map);
			}else{//若message中有数据
				int index=-1;
				//System.out.println("-----------------");
				//System.out.println("list:"+list.get(i).getYx_xm());
				for(int n=0;n<message.size();n++){//遍历message数组
					//System.out.println("message:"+message.get(n)+"|"+n);
					String xm=(String) message.get(n).get("xm");
					if(xm.equals((String)list.get(i).getYx_xm())){
						index=n;
						//System.out.println(list.get(i).getZjhm()+":"+n);
					}										
				}
				if(index!=-1){
					List<Map>new_message=new ArrayList<Map>();
					for(int n=0;n<message.size();n++){
						HashMap<String,Object> map1 = new HashMap<String,Object>();
						if(n==index){
							map1.put("xm", (String)message.get(n).get("xm"));
							map1.put("count",(int)message.get(n).get("count")+1);
							map1.put("kfjl", (String)message.get(n).get("kfjl")+","+list.get(i).getYx_zklsh());
							new_message.add(map1);
						}else{
							new_message.add(message.get(n));
						}
					}
					message=new_message;
				}else{
					HashMap<String,Object> map1 = new HashMap<String,Object>();
					map1.put("xm", list.get(i).getYx_xm());
					map1.put("count", 1);
					map1.put("kfjl", list.get(i).getYx_zklsh());
					message.add(map1);
				}
			}	
			
		}
		piaoke.setMessage(message.toString());	
		//System.out.println(piaoke.toString());
		piaokeMapper.save(piaoke);
	}
	
	/**
	 * 根据历史宾馆记录,匹配并存储历史异性开房记录
	 * 测试:最快方法,按天数据进行匹配
	 * @param month
	 * @return
	 */
	public void saveYxkf_newByDay(Integer month){
		//获取month个月的天数
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -month);
		//遍历循环,按照month个月的每天的男、女开房记录来匹配对应信息
		int day=(int)((System.currentTimeMillis()-calendar.getTimeInMillis())/86400000);
		for(int i=1;i<day+1;i++){
			List<Hotelguest> xb_N = hotelguestMapper.getKfjlByXb_N_beforeDay(i);//获取i天前一天女性开房数据
			List<Hotelguest> xb_M = hotelguestMapper.getKfjlByXb_M_beforeDay(i);//获取i天前一天男性开房数据
			mateAndSaveyxkf(xb_M,xb_N);//对男女数据进行匹配,并且存储到yxkf表中
		}
	}
	
	/**
	 * 匹配提供数据,并且存储到yxkf表中
	 * @param xb_M 男开房数据
	 * @param xb_N 女开房数据
	 */
	private void mateAndSaveyxkf(List<Hotelguest> xb_M, List<Hotelguest> xb_N) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
		//对男女数据对比,匹配是否异性开房并且存储到yxkf记录中
		for(Hotelguest m:xb_M){
			for(Hotelguest n:xb_N){
					if(m.getLgmc().equals(n.getLgmc())&&
						m.getFh().equals(n.getFh())){//地点核对(宾馆+房号)
						try {
							if(format.parse(m.getRzsj()).getTime()-format.parse(n.getRzsj()).getTime()<600000&&
							   format.parse(m.getRzsj()).getTime()-format.parse(n.getRzsj()).getTime()>-600000){//时间核对(开房时间相差10分钟以内)
								if(!m.getXm().substring(0, 1).equals(n.getXm().substring(0,1))){//同姓男女数据排除
								YxkfPojo yxkfPojo = new YxkfPojo();
								//begin--将数据封装到yxkfPojo中
								yxkfPojo.setCjsj(new DateTime().toString("yyyy-MM-dd HH:mm:ss"));
								yxkfPojo.setId(0);
								yxkfPojo.setLgbm(m.getLgbm());
								yxkfPojo.setLgmc(m.getLgmc());
								yxkfPojo.setFh(m.getFh());
								yxkfPojo.setXm(m.getXm());
								yxkfPojo.setZjhm(m.getZjhm());
								yxkfPojo.setZklsh(m.getZklsh());
								yxkfPojo.setRzsj(m.getRzsj());
								yxkfPojo.setJg(m.getJg());
								yxkfPojo.setZz(m.getZz());
								yxkfPojo.setXb(m.getXb());
								yxkfPojo.setMz(m.getMz());
								yxkfPojo.setCsrq(m.getCsrq());
								yxkfPojo.setZjlx(m.getZjlx());
								yxkfPojo.setYx_xm(n.getXm());
								yxkfPojo.setYx_zklsh(n.getZklsh());
								//end--将数据封装到yxkfPojo中
								//System.out.println(yxkfPojo);
								yxkfMapper.save(yxkfPojo);
								//将匹配数据存储到yxkf表中
								break;
							}
}
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			}
		}					
		
	}
	
	
	
	
	
}
