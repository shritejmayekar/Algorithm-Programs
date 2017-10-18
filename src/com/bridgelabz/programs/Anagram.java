/******************************************************************************
 *  
 *  Purpose: To take two Strings, the second string is just arrangement of
 *  			first and vice versa than it is anagram else not.
 *  		E.G (heart and earth)
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

public class Anagram {
	public static final String ANAGRAM_MESSAGE="The String is anagram";
	public static final String NOT_ANAGRAM_MESSAGE="The String is not anagram";
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter first name and second name");
		
		try {
			if(Util.isAnagram(scanner.nextLine(), scanner.nextLine()))
				System.out.println(ANAGRAM_MESSAGE);
			else
				System.out.println(NOT_ANAGRAM_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}

}
