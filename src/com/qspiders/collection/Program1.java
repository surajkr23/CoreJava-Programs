package com.qspiders.collection;

import java.util.ArrayList;
class Mobile
{
	int ram;
	boolean audioJack;
	double weight;
	
	public Mobile(int ram, boolean audioJack, double weight) {
		this.ram = ram;
		this.audioJack = audioJack;
		this.weight = weight;
	}
}
class HeadPhone
{
	int price;
	boolean wired;
	
	public HeadPhone(int price, boolean wired) {
		this.price = price;
		this.wired = wired;
	}
}
public class Program1 {
	public Program1(int a, float b) {
		super();
		this.a = a;
		this.b = b;
	}

	int a;
	float b;
	public String toString()
	{
		return "a="+a+" b="+b;
	}


	public static void main(String[] args) {
		ArrayList a1=new ArrayList();  //zero argument constructor
		a1.add("qwerty");
		a1.add("java");
		a1.add("java");   //duplicate objects allowed
		a1.add("");       //null value allowed
		Program1 p1=new Program1(12,23.4f);
		Program1 p2=new Program1(54,322.24f);
		a1.add(p1);
		a1.add(p2);
		a1.remove(0);
		a1.add(0,"qwerty");
		System.out.println(a1.size());
		System.out.println(a1.get(2));
		for(int index=0; index<a1.size(); index++)
		{
			Object ob = a1.get(index);
			System.out.println(ob);
		}
		
		ArrayList a2=new ArrayList(a1);  //collection argument constructor
		System.out.println(a2.size());
		
		ArrayList a3=new ArrayList(100);  //int argument constructor
		
		ArrayList<HeadPhone> a4=new ArrayList();
		HeadPhone h1=new HeadPhone(800,false);
		HeadPhone h2=new HeadPhone(900,true);
		Mobile m1=new Mobile(4,true,205.67);
		Mobile m2=new Mobile(8,true,265.87);
		a4.add(h1);
		a4.add(h2);
		//a4.add(m1);
	}
}

