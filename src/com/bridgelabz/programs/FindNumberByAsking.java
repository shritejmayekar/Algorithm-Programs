/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/FindNumberByAsking.java
 *  Execution:    java -cp bin com.bridgelabz.programs.FindNumberByAsking
 *  
 *  Purpose: To FindNuber using binary search method by asking questions
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
public class FindNumberByAsking{
	public static int number;
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		
			number=Integer.parseInt(args[0]);
			System.out.println("Guess number between o to "+(Math.pow(2, number)-1));
			int value=scanner.nextInt();
			Utility.binarySearch(0,(int)Math.pow(2,number),value);
			scanner.close();
	}

}
