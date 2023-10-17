package com.qspiders.libraries;
class Demo
{
	public int hashCode()        //Overriding inbuilt method
	{
		return 12345;
	}
	public String toString()     //Overriding inbuilt method
	{
		return "abc123";
	}
}
public class Program2 {

	public static void main(String[] args) {
		Program2 p2=new Program2();
		System.out.println(p2.hashCode());
		System.out.println(p2.toString());     //fully qualified class name@hexadecimal value
		Demo d1=new Demo();
		System.out.println(d1.hashCode());
		System.out.println(d1.toString());
	}

}
