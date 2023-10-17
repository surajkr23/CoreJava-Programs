package com.qspiders.polymorphism;

class Planet
{
	void rotation()
	{
		System.out.println("rotation..");
	}
	void revolution()
	{
		System.out.println("revolution..");
	}
}
class Jupiter extends Planet
{
	void rotation()
	{
		System.out.println("it takes 10 hours to complete one rotation..");
	}
	void revolution()
	{
		System.out.println("it takes 11 years to complete one revolution..");
	}
}
class Earth extends Planet
{
	void rotation()
	{
		System.out.println("it takes 24 hours to complete one rotation..");
	}
	void revolution()
	{
		System.out.println("it takes 365 days to complete one revolution..");
	}
}
class Mars extends Planet
{
	void rotation()
	{
		System.out.println("it takes 25 hours to complete one rotation..");
	}
	void revolution()
	{
		System.out.println("it takes 687 days to complete one revolution..");
	}
}
class Satellite
{
	void visit(Planet ref)
	{
		ref.rotation();
		ref.revolution();
	}
}

public class Program1 {

	public static void main(String[] args)
	{
		Satellite s1=new Satellite();
		s1.visit(new Jupiter());
		s1.visit(new Earth());
		s1.visit(new Mars ());
	}

}
