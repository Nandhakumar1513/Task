package com.oops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,num,fact=1;  
		System.out.println("Find the factorial of given number");
		System.out.println("Enter a number: ");
		num=sc.nextInt();
		for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+num+" is: "+fact);   

	}

}
