package com.qspiders.collection;

public class Program2 {

	int [] ar= {2,3,5,7,9,1};
	char [] ch= {'t','e','s','t','i','n','g'};
	
	public static void main(String[] args) {
		double[]ar1;
		ar1= new double[6];
		ar1[0]=23.32;
		ar1[4]=253.12;
		ar1[2]=73.2;
		ar1[5]=113.32;
		ar1[3]=423.552;
		ar1[1]=98.3;
		
		System.out.println("values of 1st array..");
		for(int i=0; i<ar1.length; i++)
		{
			System.out.println(ar1[i]);
		}
		
		System.out.println("values of 2nd array..");
		Program2 p2=new Program2();
		int[] ar2 = p2.ar;
		for(int i=0; i<ar2.length; i++)
		{
			System.out.println(ar2[i]);
		}
		
		System.out.println("values of 3rd array..");
		for(int i=0; i<p2.ch.length; i++)
		{
			System.out.println(p2.ch[i]);
		}

	}

}
