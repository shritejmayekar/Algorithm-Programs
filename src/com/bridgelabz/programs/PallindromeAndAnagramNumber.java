/******************************************************************************
 *  
 *  Purpose: To get the range of number which are anagram as well as makes pallindrome
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

public class PallindromeAndAnagramNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Please enter range  to get prime pallindrome and anagram numbers:");
			Util.anagramAndPallindrome(scanner.nextInt(), scanner.nextInt());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}

}
