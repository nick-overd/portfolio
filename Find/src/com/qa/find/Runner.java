package com.qa.find;

public class Runner{
	public static void main(String [] args) {
		System.out.println(find("hello", 2, 'e'));
		System.out.println(find("apple", 4, 'a'));
	}
	public static boolean find(String str, int index, char letter) {
		return str.subSequence(index-1, index).equals(String.valueOf(letter));
}
}
	