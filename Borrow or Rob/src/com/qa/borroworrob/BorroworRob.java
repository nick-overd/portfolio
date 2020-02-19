package com.qa.borroworrob;

public class BorroworRob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome("Borrow or Rob"));
	}
	public static boolean palindrome(String sentence) {
		String str = "";
		String sum = sentence.replace(" ", "").toLowerCase();
		for(int i = sum.length()-1;i>=0;i--) {
			str = str + sum.charAt(i);
		}
	return sum.equals(str);
}
}