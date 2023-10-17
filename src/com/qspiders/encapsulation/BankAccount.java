package com.qspiders.encapsulation;

public class BankAccount 
{
	private String name;
	private long accountNo;
	private int registerationNo;
	
	public BankAccount(String name, long accNo, int regNo)
	{
		this.name=name;
		this.accountNo=accNo;
		this.registerationNo=regNo;
	}
	
	public String getna()
	{
		System.out.println("generate otp..");
		System.out.println("validate otp..");
		return name;
	}
	public long getacNo()
	{
		System.out.println("generate otp..");
		System.out.println("validate otp..");
		return accountNo;
	}
	public int getreNo()
	{
		System.out.println("generate otp..");
		System.out.println("validate otp..");
		return registerationNo;
	}
	public void setna(String na)
	{
		System.out.println("generate otp..");
		System.out.println("validate otp..");
		name=na;
	}
}
