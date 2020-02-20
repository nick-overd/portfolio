package com.qa.anagram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Import {
	public ArrayList<String> fileToArray(String filePath) throws FileNotFoundException {
		ArrayList<String> fileArray = new ArrayList<String>();
		File file = new File(filePath);
		Scanner fileRead = new Scanner(file);
		while (fileRead.hasNextLine()) {
			// System.out.println(fileRead.nextLine());
			fileArray.add(fileRead.nextLine());

		}
		return fileArray;
	}
}