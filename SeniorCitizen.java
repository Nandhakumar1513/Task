package com.oops;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("To find a person falls under senior citizen or not");
		System.out.println("Enter your Name: ");
		String name=sc.nextLine	();
		System.out.println("Enter your Age: ");
		int age=sc.nextInt();
		if(age>=60) {
			System.out.println("Hello Mr/Mrs. "+name+" your age is "+age+" so you are a senior citizen.");
		}
		else if(age>=24)
		{
			System.out.println("Hello Mr/Mrs. "+name+" your age is "+age+" so you are an adult.");
		}
		else if(age>=7 || age<=23)
		{
			System.out.println("Hello Mr/Miss. "+name+" you age is "+age+ " so you are a student.");
		}

	}

}
