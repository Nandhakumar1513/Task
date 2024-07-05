package com.oops;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int x, y, a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Swapping of two numbers");
		System.out.println("Enter the value of x:");
		x=sc.nextInt();
		System.out.println("Enter the value of y:");
		y=sc.nextInt();
		System.out.println("Before swapping the value of x : "+x+" and the value of y: "+y);
		a=x;
		x=y;
		y=a;
		System.out.println("Before swapping the value of x : "+x+" and the value of y: "+y);
	}

}
