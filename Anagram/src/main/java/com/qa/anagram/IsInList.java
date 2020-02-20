package com.qa.anagram;

import java.util.ArrayList;

public class IsInList {
	public int isInListCount(String sortedWord, ArrayList<String> sortedWordArray) {
		int count = 0;
		for(String word:sortedWordArray) {
			if(word.contains(sortedWord)) {
				count++;
				
			}
		}
		
		
		System.out.println(count);
		return 0;
	}
	
	
}
