/******************************************************************************
 *  
 *  Purpose: To take decimal no. and convert it into binary and than swap nimble
 *  			and do produce new decimal no.
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

public class BinarySwapNimble {

	public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please enter the decimal number:");
		System.out.println("binary number="+Util.toBinary(scanner.nextInt()));

	}

}
