package com.oops;

import java.util.Scanner;

public class NumberofDigits {

	public static void main(String[] args) {
		int count=0, num;
		Scanner sc=new Scanner(System.in);
		System.out.println("To find number of digits in an integer");
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		while(num!=0) {
			num=num/10;
			++count;
		}
		System.out.println("The number of digits: "+count);
	}

}
