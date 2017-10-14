/******************************************************************************
 *  
 *  Purpose: To Find Square root of number using newtons method
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

public class SqureRoot {
	public static double squareRoot;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the number to find squareroot:");
		squareRoot=Util.sqrt(scanner.nextDouble());
		
		System.out.println("The squareroot is "+squareRoot);
		scanner.close();
	}

}
