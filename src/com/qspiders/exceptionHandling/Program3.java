package com.qspiders.exceptionHandling;

import java.io.IOException;

public class Program3 {
	void developer() throws IOException
	{
		System.out.println("write code");
		throw new IOException();
	}
	void teamLead() throws IOException 
	{
		System.out.println("asign task to developer");
		developer();
	}
	void projectManager() throws IOException
	{
		System.out.println("assign project to team..");
		teamLead();
	}

	public static void main(String[] args) throws IOException {
		Program3 p3=new Program3();
		try
		{
		p3.projectManager();
		}
		catch(IOException ref)
		{
			System.out.println("exception handled..");
		}

	}

}
