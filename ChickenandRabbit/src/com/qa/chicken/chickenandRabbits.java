package com.qa.chicken;

public class chickenandRabbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chickenandRabbit(10, 32);
	}
	public static void chickenandRabbit(int heads, int legs) {
		int r = heads;
		for(int i =0;i<=0;i++) {
			r--;
			int c = i;
			if((r*4 + c*2) == legs) {
				System.out.println("rabbits :" + r);
				System.out.println("chickens :" + c);
				break;
			}
			if(r==0) {
				System.out.println("no solution");
			}
			else {
				continue;
			}
		}
	}
}
