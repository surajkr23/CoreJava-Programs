package com.qspiders.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

class CurrencyNote
{
	int value;
	String colour;
	int serialNo;
	public CurrencyNote(int value, String colour, int serialNo) {
	
		this.value = value;
		this.colour = colour;
		this.serialNo = serialNo;
	}
	@Override
	public String toString() {
		return "CurrencyNote [value=" + value + ", colour=" + colour + ", serialNo=" + serialNo + "]";
	}
	@Override
	public int hashCode() {
		return serialNo;
	}
	@Override
	public boolean equals(Object obj) {
		CurrencyNote ct=(CurrencyNote)obj;
		return this.serialNo==ct.serialNo;
	}
	
}

public class Program5 {

	public static void main(String[] args) {
		LinkedHashSet ref=new LinkedHashSet();
		ref.add(23);
		ref.add("chandu");
		ref.add(45);
		System.out.println(ref.size());
		
		
		CurrencyNote c1=new CurrencyNote(2000,"pink",234567);
		CurrencyNote c2=new CurrencyNote(2000,"pink",234567);
		ref.add(c1);
		ref.add(c2);
		
		Iterator ref1 = ref.iterator();
		while(ref1.hasNext())
		{
			System.out.println(ref1.next());
		}

	}

}
