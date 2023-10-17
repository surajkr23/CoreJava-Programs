package com.qspiders.encapsulation;

public class Sbi {

	public static void main(String[] args) 
	{
		BankAccount b1=new BankAccount("Suraj", 72314241901412L, 234);
		System.out.println("name="+b1.getna());
		System.out.println("accountNo="+b1.getacNo());
		System.out.println("regNo="+b1.getreNo());
		b1.setna("Rishant");
		System.out.println("name="+b1.getna());
	}

}
