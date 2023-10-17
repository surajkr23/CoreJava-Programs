package com.qspiders.exceptionHandling;

public class Program1 
{
	int a=12;
	int []ar= {11,23,34,32,52};
	void interview()
	{
	System.out.println("i am suraj");
	System.out.println("call for 1st round interview");
	//System.exit(0);
	System.out.println("attended interview");
	try
	{
	int a=1/0;
	System.out.println(ar[7]);
	System.out.println("selected");
	}
		catch(ArrayIndexOutOfBoundsException ref)
		{
			System.out.println("Exception handled");
			System.out.println("rejected..");
			System.out.println("bounce back strongly..");
		}
		catch(ArithmeticException ref)
	{
			System.out.println("Exception handled");
			
	}
		finally
		{
			System.out.println("move on and be happy");
		}
	}

	public static void main(String[] args) {
		Program1 p1=new Program1();
		p1.interview();

	}

}
