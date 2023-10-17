package com.qspiders.hybridInheritance;
interface Father 
{
	void medicine();
}
interface Mother
{
	void dhania();
	void pudina();
	void medicine();
}
abstract class Daughter
{
	public void medicine()
	{
		System.out.println("baught medicine...");
	}
}
class Son extends Daughter implements Mother,Father
{
	public void dhania()
	{
		System.out.println("baught dhania...");
	}
	public void pudina()
	{
		System.out.println("baught pudina...");
	}
	
}
public class Mainclass {

	public static void main(String[] args) 
	{
		Son s1=new Son();
		s1.dhania();
		s1.pudina();
		s1.medicine();

	}

}
