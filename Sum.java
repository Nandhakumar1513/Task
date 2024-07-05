package com.oops;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To find the greatest sum between four numbers");
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b=sc.nextInt();
		System.out.println("Enter the value of c: ");
		int c=sc.nextInt();
		System.out.println("Enter the value of d: ");
		int d=sc.nextInt();
		int sum1=0, sum2=0;
		sum1=a+b;
		sum2=c+d;
		if(sum1>sum2) {
			System.out.println("The sum of a and b is "+sum1+" is the greatest value");
		}
		else
		{
			System.out.println("The sum of c and d is "+sum2+" is the greatest value");
		}
	}

}
