package com.qa.oddity;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oddity(new int[] {1,5,10,2,7}));

	}
	public static List<Integer> oddity(int[] nums){
		List<Integer> newList = new ArrayList<>();
		for(int numbers : nums) {
			if(numbers % 2 !=0) {
				newList.add(numbers);
			}
		}
		return newList;
		
	}

}
