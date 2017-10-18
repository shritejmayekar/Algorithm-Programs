/******************************************************************************
 *  
 *  Purpose: To sort the string array
 
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

public class MergeSort {
	public static String sentence;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("please enter the sentence:");
			sentence=scanner.nextLine();
			String stringArray[]=sentence.split("\\s");
			
			Utility.mergeSort(stringArray);
			System.out.println("Sorted string:");
			for (int i = 0; i < stringArray.length; i++) {
				System.out.print(stringArray[i]+" ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		scanner.close();
		
	}

}
