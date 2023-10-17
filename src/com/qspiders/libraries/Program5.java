package com.qspiders.libraries;

public class Program5 {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder();  //not thread safe
		s1.append("hello");
		s1.append(" java");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer();    //thread safe
		s2.append("hello");
		s2.append(" moto");
		System.out.println(s2);
		s2.reverse();
		System.out.println(s2);
	}

}
