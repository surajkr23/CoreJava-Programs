package com.qspiders.exceptionHandling;

public class Program2 {
	void developer()
	{
		System.out.println("write code");
		int i=1/0;
	}
	void teamLead()
	{
		System.out.println("asign task to developer");
		developer();
	}
	void projectManager()
	{
		System.out.println("assign project to team..");
		teamLead();
	}

	public static void main(String[] args) {
		Program2 p2=new Program2();
		try
		{
		p2.projectManager();
		}
		catch(ArithmeticException ref)
		{
			System.out.println("exception handled..");
		}
	}

}
