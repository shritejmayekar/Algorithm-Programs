
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.Util;
/******************************************************************************
 *  
 *  Purpose: To Find minimum no. of notes to be return to person as change
 *  		 here is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes 
 *  		 1529= 	1 Note 1000
 *  				1 Note 500
 *  				2 Note 10
 *  				1 Note 5
 *  				2 Note 4
 *  				
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
public class VendingMachine {
	public static int changeOfAmount;

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Please enter the changeOfamount:");
			changeOfAmount=scanner.nextInt();
			Util.amountChange(changeOfAmount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
