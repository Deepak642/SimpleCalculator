package com.simplilearn.calc;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter first number");
		double num1=scanner.nextDouble();
		System.out.println("enter second number");
		double num2=scanner.nextDouble();
		System.out.println("enter the operator to perform operation on entered two numbers(+,-,*,/)");
		String operator= scanner.next();
		char op=operator.charAt(0);
		double res=0;
		switch(op) {
		case '+':
			res=num1+num2;
			break;
		case '-':
			res=num1-num2;
			break;
		case '*':
			res=num1*num2;
			break;
		case '/':
			res=num1/num2;
			break;
		default:
			System.out.println("Enter correct operator");
			break;
		
		}
		System.out.println("results:"+num1 + " " + op + num2 + "=" + res);
		scanner.close();

			
		
		
		
	}

}
