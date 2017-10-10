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
	public static int[] notes={1000,500,100,50,10,5,2,1};
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Please enter the changeOfamount:");
	changeOfAmount=scanner.nextInt();

	while(changeOfAmount>0) {
		if(changeOfAmount%1000==0) {
			changeOfAmount=changeOfAmount-1000;
			System.out.println("1000");
			}
			else if(changeOfAmount%500==0) {
			changeOfAmount=changeOfAmount-500;
			System.out.println("500");
			}
			else if(changeOfAmount%100==0) {
			changeOfAmount=changeOfAmount-100;
			System.out.println("100");
			}
			else if(changeOfAmount%50==0) {
			changeOfAmount=changeOfAmount-50;
			System.out.println("50");
			}

			else if(changeOfAmount%10==0) {
			changeOfAmount=changeOfAmount-10;
			System.out.println("10");
			}
			else 
			{
				
				if(changeOfAmount%5==0) {
					changeOfAmount=changeOfAmount-5;
					System.out.println("5");
					}
					else if(changeOfAmount%2==0) {
						changeOfAmount=changeOfAmount-2;
						System.out.println("2");
						
						
						}
					
					else if(changeOfAmount%1==0) {
					changeOfAmount=changeOfAmount-1;
					System.out.println("1");
					}
				
				
			}
		
		
			
		
	}
	}

}
/*if(changeOfAmount%1000==0) {
changeOfAmount=changeOfAmount-1000;
System.out.println("1000");
}
else if(changeOfAmount%500==0) {
changeOfAmount=changeOfAmount-500;
System.out.println("500");
}
else if(changeOfAmount%100==0) {
changeOfAmount=changeOfAmount-100;
System.out.println("100");
}
else if(changeOfAmount%50==0) {
changeOfAmount=changeOfAmount-50;
System.out.println("50");
}

else if(changeOfAmount%10==0) {
changeOfAmount=changeOfAmount-10;
System.out.println("10");
}
else if(changeOfAmount%5==0) {
changeOfAmount=changeOfAmount-5;
System.out.println("5");
}
else if(changeOfAmount%2==0) {
changeOfAmount=changeOfAmount-2;
System.out.println("2");
}
else if(changeOfAmount%1==0) {
changeOfAmount=changeOfAmount-1;
System.out.println("1");
}*/
