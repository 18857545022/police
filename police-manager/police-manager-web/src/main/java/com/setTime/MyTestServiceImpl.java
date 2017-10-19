package com.setTime;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.police.service.Piaoke_condition1;
import com.police.service.Piaoke_condition2;
@Component 
public class MyTestServiceImpl implements MyTestService{
	
	@Autowired
	private Piaoke_condition1 condition1;
	@Autowired
	private Piaoke_condition2 condition2;
	
	@Scheduled(cron="0 0 8-18/1 * * ?")
	public void work_oneHour(){
		System.out.println(new DateTime().toString("yy-MM-dd HH:mm:ss")+ ">>>>>>启动任务");
		//---------------------------------------------------------------------------------
		condition1.workBypiaoke_count_hour(5,10);
		System.out.println("   "+new DateTime().toString("yy-MM-dd HH:mm:ss")+">>>>>>条件1嫖客数据更新成功");
		condition2.saveYxkf_hour(10);
		System.out.println(("   "+new DateTime().toString("yy-MM-dd HH:mm:ss")+">>>>>>异性开房数据更新成功"));
		condition2.workBypiaoke_yx_hour(5, 10);
		System.out.println(("   "+new DateTime().toString("yy-MM-dd HH:mm:ss")+">>>>>>条件2嫖客更新成功"));
		//----------------------------------------------------------------------------------
		System.out.println(new DateTime().toString("yy-MM-dd HH:mm:ss")+ ">>>>>>结束任务");
	}

}
