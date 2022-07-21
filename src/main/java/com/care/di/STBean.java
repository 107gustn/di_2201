package com.care.di;

public class STBean {
	private String name;
	private int age;
	private Student st;
	
	//의존성 주입 - 생성자 호출을 통해 STBean객체가 만들어져야만 st객체를 사용할 수 있다
	public STBean() { //생성자
		st = new Student(); //Student 객체 생성
	}
	
	public void namePrint() {
		st.namePrint(name);
	}
	public void agePrint() {
		st.agePrint(age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}
}
