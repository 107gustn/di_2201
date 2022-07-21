package com.care.di_test02;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String path = "classpath:application_test02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		SaveClass scs = ctx.getBean("tsc", SaveClass.class);
		
//		System.out.print("첫번째 숫자 : ");
//		scs.setNum1( sc.nextInt() );
//		System.out.print("기호 : ");
//		scs.setOp( sc.next() );
//		System.out.print("두번째 숫자 : ");
//		scs.setNum2( sc.nextInt() );
//		
		scs.operationClass();
		scs.printClass();

	}

}
