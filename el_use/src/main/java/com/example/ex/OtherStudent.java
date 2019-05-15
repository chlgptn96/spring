package com.example.ex;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class OtherStudent {
	private String name;
	private int age;

	public OtherStudent(String name, int age) {
		this.name = name;
		this.age = age;

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

	@PostConstruct
	public void initMethod() {
		System.out.println("리프레쉬");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("파괴야");
	}
}
