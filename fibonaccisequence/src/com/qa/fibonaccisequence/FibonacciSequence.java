package com.qa.fibonaccisequence;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public int fibonacciSequence(int num) {
		if(num ==0) {
			return 0;
		}
	int position =0;
	int newp=1;
	for(int i=0;i<num-1;i++) {
		int temp =position;
		position = newp;
		newp = position + temp;
	}
	return newp;
	}
	
	public int fibonacci(int num) {
		if(num==0) {
			return 0;
		}
		else if(num==1) {
			return 1;
		}
		return fibonacci(num-1) + fibonacci(num-2);
	}
	
	
	}
