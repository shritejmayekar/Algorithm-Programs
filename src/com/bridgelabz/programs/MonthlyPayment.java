/******************************************************************************
 *  
 *  Purpose: To Find monthly payment need to do by person
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

public class MonthlyPayment {
	public static double mothlyPayment;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("please enter the Principal ,rate of interate and no. of years:");
		mothlyPayment=Util.monthlyPayment(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
		System.out.println("The monthly payment="+mothlyPayment);
		scanner.close();
	}

}
