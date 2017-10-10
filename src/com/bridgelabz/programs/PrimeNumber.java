/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/PrimeNumber.java
 *  Execution:    java -cp bin com.bridgelabz.programs.PrimeNumber
 *  
 *  Purpose: To find prime numbers in specified range
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

import com.bridgelabz.util.Util;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please specify range:");
		Util.primeNumber(0, sc.nextInt());
	}

}
