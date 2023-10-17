package com.qspiders.hybridInheritance;

interface Car
{
	double torque=93.3;
	void design();
	void engine();
	void steering();
}
abstract class RangeRover implements Car
{
	public void design()
	{
		System.out.println("Range Rover design");
	}
	public void engine()
	{
		System.out.println("1800cc");
	}
}
class Tata extends RangeRover
{
	public void design()
	{
		System.out.println("Tata designed with Range Rover");
	}
	public void engine()
	{
		System.out.println("1800cc");
	}
	public void steering()
	{
		System.out.println("changed to right steering");
	}
}

public class MainClass1 {

	public static void main(String[] args) 
	{
		Tata t=new Tata();
		t.design();
		t.engine();
		System.out.println(t.torque);
	}

}
