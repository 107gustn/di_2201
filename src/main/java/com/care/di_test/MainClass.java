package com.care.di_test;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String path = "classpath:application_test.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		PrintBean printbean = ctx.getBean("pb", PrintBean.class); //(이름, 자료형)
		
//		printbean.setPrint("안녕하세요");
		printbean.print();
	}

}
 