package com.police.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.police.mapper.StudentMapper;
import com.police.pojo.Student;
import com.police.service.Piaoke_condition2;

public class TestByJava {
	@Test()
	public void mm(){
		//Date date=new Date();
		//System.out.println(date);
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -3);
		System.out.println((int)((System.currentTimeMillis()-calendar.getTimeInMillis())/86400000));
	}
	
	@Test()
	public void yxkfTest() throws Exception{
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");
		Piaoke_condition2 service = ctx.getBean("piaoke_condition2",Piaoke_condition2.class);
		long s = System.currentTimeMillis();
		service.saveYxkf_newByDay(2);
		System.out.println(System.currentTimeMillis()-s);

	}
	
	
	@Test
	public void test(){
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext(
				"spring/applicationContext-*.xml");
		StudentMapper mapper = ctx.getBean("studentMapper",StudentMapper.class);
		for(int i=0;i<2;i++){
			List<Student> list=mapper.get();
			System.out.println(list.toString());
			Student student = list.get(0);
			student.setAge(101);
		}
		
		
	}
	
	
	
	
	
	
	
	
}
