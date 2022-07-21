package com.care.di02;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.care.di02.STBean;

public class MainClass {
	public static void main(String[] args) {
		//STBean stBean = new STBean();
		
		String path = "classpath:applicationST.xml"; //classpath(src/main/resources):파일경로 지정
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext( path ); //해당 경로에 있는 xml 파일을 불러와서 번역
		STBean stBean = ctx.getBean("stb", STBean.class); //IOC컨테이너에서 빈을 꺼내옴(꺼내올 객체 이름,객체에 대한 자료형)
		
		
//		stBean.setName("홍길동");
//		stBean.setAge(20);
		stBean.namePrint();
		stBean.agePrint();
	}

}
