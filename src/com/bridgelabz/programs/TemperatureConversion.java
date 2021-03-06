/******************************************************************************
 *  
 *  Purpose: To Convert the temperature form fahrenheit to celcius and vice versa
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

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter temperature in Celcius:");
			System.out.println("Celcius to Fahrenheit:"+Util.temperatureConversionF(scanner.nextDouble()));
			System.out.println("Enter temperature in Fahrenheit:");
			System.out.println("Fahrenheit to Celcius:"+Util.temperatureConversionC(scanner.nextDouble()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scanner.close();
	}

}
