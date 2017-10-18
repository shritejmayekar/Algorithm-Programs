/******************************************************************************
 * 
 * 
 *  Purpose: To convert decimal to binary
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

public class DecimalToBinary {
	public static String binary;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		try {
			System.out.println("please enter the decimal number:");
			binary=Util.toBinary(scanner.nextInt());
			System.out.println("The binary number is "+binary);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}

}
