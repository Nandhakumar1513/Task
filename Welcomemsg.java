package com.oops;

import java.util.Scanner;

public class Welcomemsg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To print the Welcome Message");
		System.out.println("Enter the message: ");
		String str1=sc.nextLine();
		System.out.println("Enter the number of time message to be printed: ");
		int n=sc.nextInt();
		for(int i=1; i<=n;i++)
		{
			System.out.println(" "+str1);
		}

	}

}
