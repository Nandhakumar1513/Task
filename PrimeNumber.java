package com.oops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num, count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("To find the given number is Prime number or not");
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
			
		}
		if(count==0) {
			System.out.println("The given number "+num+" is a Prime number");
		}
		else {
			System.out.println("The given number "+num+" is not a Prime number");
		}

	}

}
