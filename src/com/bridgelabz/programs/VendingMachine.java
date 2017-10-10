/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/VendingMachinejava
 *  Execution:    java -cp bin com.bridgelabz.programs.VendingMachine
 *  
 *  Purpose: To Find minimum no. of notes to be return to person as change
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
/**
 * 
 * @author shritej here is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes 
 * 10000  
 * 1000               1529
 *         1000+500+20+9
 *         1000
 * 500
 * 100
 * 50
 * 5
 * 2
 * 1
 *
 */
public class VendingMachine {
	
	public static int changeOfAmount;
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the changeOfamount:");
	changeOfAmount=scanner.nextInt();
	int Note=0,num=0,n=1;
	while(changeOfAmount>0) {
		Note=changeOfAmount%10;
		
		for (int i =1;i<=5;i++) {
			if(i==1||i==2||i==5) {
				if(Note%i==0) {
					num=Note/i;
					System.out.println("Notes"+num +" X" +i);
				}
				//System.out.println(Note);
			}
			
			
		}
		changeOfAmount=changeOfAmount/10;
	}

	}

}
