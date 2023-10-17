package com.qspiders.encapsulation;

public class Program 
{
	private String name;
	private int number;

	public Program(String name, int number)
	{
	this.name=name;
	this.number=number;
	}

	public String getna()
	{
		System.out.println("generate otp..");
		System.out.println("validate otp..");
	return name;
	}

	public int getno()
	{
		System.out.println("generate otp..");
		System.out.println("validate otp..");
	return number;
	}

	public void setna(String na)
	{
	System.out.println("generate otp..");
	System.out.println("validate otp..");
	name=na;
	}

	public void setno(int no)
	{
		System.out.println("generate otp..");
		System.out.println("validate otp..");
	number=no;
	}
	public static void main(String[] args) {
		Program p1=new Program("Suraj", 1232);
		System.out.println("name="+p1.getna());
		System.out.println("number="+p1.getno());
		p1.setna("Rahul");
		p1.setno(4567);
		System.out.println("name="+p1.getna());
		System.out.println("number="+p1.getno());

	}

}
