package com.qspiders.constructors;

public class Bottle 
{
	String logo;
	String shape;
	float capacity;
	String colour;
	int price;
	
	Bottle()
	{
		logo="Milton";
		shape="Cylindrical";
	}
	Bottle(Float capacity, String colour, int price)
	{
		this();
		this.capacity=capacity;
		this.colour=colour;
		this.price=price;
	}
	public static void main(String[] args) 
	{
		Bottle b1=new Bottle(1.2f,"blue",20);
		System.out.println("logo="+b1.logo);
		System.out.println("shape="+b1.shape);
		System.out.println("capacity="+b1.capacity);
		System.out.println("colour="+b1.colour);
		System.out.println("price="+b1.price);
		
		Bottle b2=new Bottle(2.2f,"green",50);
		System.out.println("logo="+b2.logo);
		System.out.println("shape="+b2.shape);
		System.out.println("capacity="+b2.capacity);
		System.out.println("colour="+b2.colour);
		System.out.println("price="+b2.price);

	}

}
