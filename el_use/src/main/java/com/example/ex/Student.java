package com.example.ex;

import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
   private String name;
   private int age;
   public Student(String name, int age) {
      this.name= name;
      this.age= age;
      
      
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
@Override
public void destroy() throws Exception {
	System.out.println("참치마요컵밥");
	
}
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("딸기 우유");
}

   
}