package com.qspiders.libraries;

public class Program4 {
	static String c="java";
	static String s=new String("JAVA is an interesting language");
	public static void main(String[] args) {
		System.out.println(c.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(11));
		int ch=s.indexOf('g');
		System.out.println(ch);
		System.out.println(s.substring(ch));
		System.out.println(s.substring(ch,25));
		boolean res = c.startsWith("java");
		System.out.println(res);
		System.out.println(s.endsWith("java"));
	}

}