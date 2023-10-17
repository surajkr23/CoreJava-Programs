package com.qspiders.exceptionHandling;

public class Program4 {
	void demo() throws CreatedByMeException
	{
		System.out.println("i am demo..");
		throw new CreatedByMeException();
	}
	class CreatedByMeException extends Exception
	{
	
	}
	public static void main(String[] args) throws CreatedByMeException {
		Program4 p4=new Program4();
		try
		{
		p4.demo();
		}
		catch(CreatedByMeException ref)
		{
			System.out.println("exception handled...");
			ref.printStackTrace();   //name of exception, where it originated, where it propagated
		}

	}

}
