package com.qspiders.libraries;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer..");
		int a=sc.nextInt();
		System.out.println("a="+a);
		System.out.println("enter a double value..");
		double b= sc.nextDouble();
		System.out.println("b="+b);
		System.out.println("enter a word..");
		String c=sc.next();
		System.out.println("c="+c);
		System.out.println("enter a sentence..");
		String d =sc.nextLine();
		System.out.println("d="+d);
	}

}
