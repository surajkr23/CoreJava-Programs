package com.qspiders.libraries;
class CurrencyNote
{
	String colour;
	int value;
	int serialNo;
	
	public CurrencyNote(String colour, int value, int serialNo)
	{
		this.colour=colour;
		this.value=value;
		this.serialNo=serialNo;
	}
	public boolean equals(Object ob)
	{
		CurrencyNote ct=(CurrencyNote)ob;
		return this.serialNo==ct.serialNo;
	}
}
public class Program3 {

	public static void main(String[] args) {
		CurrencyNote c1=new CurrencyNote("blue",2000,456789);
		CurrencyNote c2=new CurrencyNote("blue",2000,456789);
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
	}

}
