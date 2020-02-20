package com.qa.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sorted {
	public ArrayList<String> reverseAllElements(ArrayList<String> wordArray){
		ArrayList<String> sortedArray = new ArrayList<String>();
		for(String word :wordArray) {
			char[] tempArray = word.toCharArray();
		
	
			Arrays.sort(tempArray);
			sortedArray.add(new String (tempArray));
			
		}
		
		
		return sortedArray;
		
	}

}
