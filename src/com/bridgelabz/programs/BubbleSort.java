/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/BubbleSort.java
 *  Execution:    java -cp bin com.bridgelabz.programs.BubbleSort
 *  
 *  Purpose: To sort integer using bubble sort
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

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of array:");
		Integer[] unSortedarray=new Integer[scanner.nextInt()];
		System.out.println("Enter elements:");
		for (int i = 0; i < unSortedarray.length; i++) {
			unSortedarray[i]=scanner.nextInt();
		}
		Utility.bubbleSort(unSortedarray);
		System.out.println("Sorted by Bubble sort");
		for (int i = 0; i < unSortedarray.length; i++) {
			System.out.print(unSortedarray[i]+" ");
		}
		

	}

}
