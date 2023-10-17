package com.qspiders.wrapper;

public class Program1 {

	int c=23;
	Integer i=c; //boxing
	
	Double b=42.2;
	double d=b;  //unboxing
	
	boolean res=false;
	Boolean ref=res;  //boxing
	public static void main(String[] args) {
		Program1 p1=new Program1();
		System.out.println(p1.i);
		System.out.println(p1.ref);

	}

}
