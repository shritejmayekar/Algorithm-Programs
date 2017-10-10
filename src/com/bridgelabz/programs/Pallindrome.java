/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/Pallindrome.java
 *  Execution:    java -cp bin com.bridgelabz.programs.Pallindrome
 *  
 *  Purpose: To find string/integer are pallindrome or not
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

public class Pallindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Find pallindrome \n1.string\n2.number");
		try {
			switch(scanner.nextInt()) {
				case 1:System.out.println("Pallindrome:"+Util.isPallindrome(scanner.next()));
						break;
				case 2:System.out.println("Pallindrome:"+Util.isPallindrome(scanner.nextInt()));
						break;
				default:
					System.out.println("Invalid");
			}
		}
		catch(Exception exception) {
			System.out.println("Exception:"+exception);
		}
	}

}
