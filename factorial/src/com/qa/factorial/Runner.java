package com.qa.factorial;

public class Runner {
	public static void main(String[]args) {
		 int i; 
		 int fact=1;  
		 int num=7;
		 for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+num+" is: "+fact);    
		  System.out.println(factorial(6));
		 }  
	public static int factorial(int num) {
		int fact =1;
		int i;
		for(i=num; i>1; i--) {
			fact=fact*i;
			
		}
		return fact;
	}
	
		}  