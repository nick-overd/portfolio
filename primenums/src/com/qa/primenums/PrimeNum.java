package com.qa.primenums;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeNum(1000));
	}
	public static int primeNum(int num) {
		int count =0;
		for(int i =2;i<=num;i++) {
			boolean isPrime =true;
			
			for(int j=2;j<=(int)Math.sqrt(i);j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			if(isPrime) {
				count +=1;
			}
				
		}
}
		return count;
}
}
