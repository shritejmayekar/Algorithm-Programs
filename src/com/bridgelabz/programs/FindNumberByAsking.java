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
	public static int numberN;
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
			System.out.print("Enter the number:");
			numberN=scanner.nextInt();
			Utility.binarySearch(0,(int)Math.pow(2, 10), numberN);
		
	}

}
