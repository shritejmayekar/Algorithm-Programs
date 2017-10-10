/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/BinarySearchString.java
 *  Execution:    java -cp bin com.bridgelabz.programs.BinarySearchString
 *  
 *  Purpose: To search string in sentence
 *  	
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BinarySearchString {
	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("please enter the sentence");
		String userInput=scanner.nextLine();
		
		String arrayForBinary[]=userInput.split("\\s");
		Utility.bubbleSort(arrayForBinary);
		for(String sortedArray: arrayForBinary)
			System.out.print(sortedArray+" ");
		System.out.println("please enter the word to search");
		int position=Utility.binarySearch(arrayForBinary, scanner.next());
		if(position==-1)
			System.out.println("word not found");
		else
			System.out.println("word at position:"+position);
	}

}
