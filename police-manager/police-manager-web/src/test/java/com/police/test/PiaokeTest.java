package com.police.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.fabric.xmlrpc.base.Array;
import com.police.service.Piaoke_condition1;
import com.police.service.Piaoke_condition2;

public class PiaokeTest {

	@Test()
	public void piaoke_condition2_saveYxkf() throws Exception{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");
		Piaoke_condition2 service = ctx.getBean("piaoke_condition2",Piaoke_condition2.class);
		long s = System.currentTimeMillis();
		service.saveYxkf_newByDay(3);
		
		System.out.println(System.currentTimeMillis()-s);

	}
	@Test()
	public void piaoke_condition2_savePiaoke() throws Exception{//存在问题
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");
		Piaoke_condition2 service = ctx.getBean("piaoke_condition2",Piaoke_condition2.class);
		long s = System.currentTimeMillis();
		service.workBypiaoke_yx_hour(3, 1);
		System.out.println(System.currentTimeMillis()-s);

	}
	
	@Test()
	public void piaoke_condition2_savePiaoke_init() throws Exception{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");
		Piaoke_condition2 service = ctx.getBean("piaoke_condition2",Piaoke_condition2.class);
		long s = System.currentTimeMillis();
		service.workBypiaoke_yx_init(3);
		System.out.println(System.currentTimeMillis()-s);

	}
	
	@Test()
	public void piaoke_condition1_init() throws Exception{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");
		Piaoke_condition1 service = ctx.getBean("piaoke_condition1",Piaoke_condition1.class);
		long s = System.currentTimeMillis();
		service.workBypiaoke_count_init(6);
		System.out.println(System.currentTimeMillis()-s);

	}
	
	
	@Test()
	public void piaoke_condition1_hour() throws Exception{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");
		Piaoke_condition1 service = ctx.getBean("piaoke_condition1",Piaoke_condition1.class);
		long s = System.currentTimeMillis();
		service.workBypiaoke_count_hour(6, 30);
		System.out.println(System.currentTimeMillis()-s);

	}
	
	
	@Test
	public void test(){
		List<String> a=new ArrayList();
		a.add("a");
		a.add("b");
		List<String> b=a;
		b.add("c");
		System.out.println(a.toString());
	}

}
