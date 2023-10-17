package com.qspiders.collection;

import java.util.LinkedList;

class MobilePhone
{
	int ram;
	boolean audioJack;
	double weight;
	
	public MobilePhone(int ram, boolean audioJack, double weight) {
		this.ram = ram;
		this.audioJack = audioJack;
		this.weight = weight;
	}
public String toString()
{
	return " ram= "+ram+" audioJack= "+audioJack+" weight= "+weight;
}
}
class EarPhone
{
	int price;
	boolean wired;
	
	public EarPhone(int price, boolean wired) {
		this.price = price;
		this.wired = wired;
	}
public String toString()
{
	return " price= "+price+" wired= "+wired;
}
}

public class Program3 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		MobilePhone m1=new MobilePhone(12,true,242.43);
		MobilePhone m2=new MobilePhone(8,false,142.23);
		EarPhone h1=new EarPhone(900,true);
		EarPhone h2=new EarPhone(1000,false);
		l1.add(m1);
		l1.add(m2);
		l1.add(h1);
		l1.add(h2);
		
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i));
		}

	}

}
