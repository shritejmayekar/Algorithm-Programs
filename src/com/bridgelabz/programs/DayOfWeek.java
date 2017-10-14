/******************************************************************************
 * 
 * 
 *  Purpose: To find month and day using date given by user
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

import com.bridgelabz.util.Util;


public class DayOfWeek {
	public static int month,year,day;
	public static void main(String[] args) {

		month=Integer.parseInt(args[0]);
		day=Integer.parseInt(args[1]);
		year=Integer.parseInt(args[2]);
		Util.dayOfWeek(month, day, year);
	}

}
