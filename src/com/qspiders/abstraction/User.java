 package com.qspiders.abstraction;

interface TeleVision
{
	void pictureQuality();
	void sound();
}
class Sony implements TeleVision
{
	public void pictureQuality()
	{
		System.out.println("Oled display with 1080p resolution");
	}
	public void sound()
	{
		System.out.println("Hi-Res audio");
	}
}
class OnePlus implements TeleVision
{
	public void pictureQuality()
	{
		System.out.println("Amoled display with 1080p resolution");
	}
	public void sound()
	{
		System.out.println("Dolby Atmos audio");
	}
}
class Amazon
{
	TeleVision onlineOrder(char type)
	{
		if(type=='s')
		{
			return new Sony();
		}
		else
		{
			return new OnePlus();
		}
	}
}

public class User {

	public static void main(String[] args) 
	{
		Amazon a1=new Amazon();
		TeleVision ref=a1.onlineOrder('o');
		ref.pictureQuality();
		ref.sound();

	}

}
