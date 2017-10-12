/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/VendingMachinejava
 *  Execution:    java -cp bin com.bridgelabz.programs.VendingMachine
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
package com.bridgelabz.programs;

import java.util.Scanner;
import java.util.logging.Handler;
/**
 * 
 * @author shritej
 * 10000  
 * 1000              
 *         1000+500+20+9
 *	1000   1
 * 500     1/2
 * 100     1/5
 * 50       1/2
 * 5        1/5
 * 2        1/2
 * 1        1/5   2 5
 *
 */
public class VendingMachine {
	
	public static int changeOfAmount;
	public static int[] notes={1000,500,100,50,20,10,5,2,1};
	public static int[] changeNotes=new int[10];
	public static void calMoney(int changeOfAmount) {
		int j=0;
		while(changeOfAmount>10) {
		for(int k=0;k<notes.length;k++)
			if(changeOfAmount%notes[k]==0) {
				changeOfAmount=changeOfAmount-notes[k];
				changeNotes[j++]=notes[k];
				System.out.print(notes[k]+" ");
				break;
			}
		
		
		}
		
		
		
	}
	
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the changeOfamount:");
	changeOfAmount=scanner.nextInt();
	
	calMoney(changeOfAmount);

	}

}
