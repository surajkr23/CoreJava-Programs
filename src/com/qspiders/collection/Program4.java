package com.qspiders.collection;

import java.util.HashSet;
import java.util.Iterator;
class Bottle
{
	int capacity;
	String colour;
	public Bottle(int capacity, String colour) {
		super();
		this.capacity = capacity;
		this.colour = colour;
	}
	
}
public class Program4 {


	public static void main(String[] args) {
		HashSet ref=new HashSet();
		ref.add("billu");
		ref.add("matru");
		ref.add("matru");
		ref.add("mohit");
		ref.add("");
		ref.add("");
		
		Bottle b1=new Bottle(2,"blue");
		ref.add(b1);
		ref.remove("matru");
		
		Iterator res = ref.iterator();
		
		while(res.hasNext())
		{
			System.out.println(res.next());
		}

	}

}
