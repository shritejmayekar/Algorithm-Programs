/******************************************************************************
 *  
 *  Purpose: To take sentence and sort String by using insertionSort and show output
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

public class InsertionSort {
	public static String listOfWords;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the words");
		listOfWords=scanner.nextLine();
		
		String unSortedarray[]=listOfWords.split("\\s");
		Utility.insertionSort(unSortedarray);
		
		System.out.println("Sorted by Insertion sort");
		for (int i = 0; i < unSortedarray.length; i++) {
			System.out.print(unSortedarray[i]+" ");
		}
		
		
		scanner.close();
	}

}
