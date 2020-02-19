package com.qa.uniqueletters;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniqueLetters("Asthekkking"));

	}
	public static String uniqueLetters(String sentence) {
//		Set<Charater>uniqueletterList = new Set<Charater>();
//		String uniqueLetters = "";
//		for(int i = 0;i<sentence.length();i++) {
//			uniqueletterList.add(sentence.charAt(i));
//		}
//		for(Char c : uniqueletterList) {
//			uniqueLetters = uniqueLetters + c;
//		}
//		return uniqueLetters;
//	}
	return Arrays.asList(sentence.split("")).stream().distinct().collect(Collectors.joining(""));
		
	}
}
