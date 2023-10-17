package com.qspiders.singleton;

class Database
{
	Database()
	{
		System.out.println("object created..");
	}
	void saveData(String data)
	{
		System.out.println("save the data..");
	}
	static Database createObject()
	{
		return new Database();
	}
}
public class Program1 {

	public static void main(String[] args) {
		Database d1=new Database();
		d1.saveData("skill");
		Database d2=new Database();
		d2.saveData("Interview");

	}

}
