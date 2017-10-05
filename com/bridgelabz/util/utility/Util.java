/******************************************************************************
 *  Compilation:  javac -d . Util.java
 *  
 *  Purpose: To perform different functionality
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   04-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util.utility;

public class Util {
/**
 * 
 * @param string1
 * @param string2
 * @return boolean (isAnagram or not)
 */
	public static boolean isAnagram(String string1,String string2) {
		int counter=0; 
		/* 
		 * Remove space
		 */
		string1=string1.replaceAll("\\s","");
		string2=string2.replaceAll("\\s","");
		/*
		 * convert to lower case
		 */
		string1=string1.toLowerCase();
		string2=string2.toLowerCase();
		/*
		 * String to char array conversion
		 */
		char chararray1[]=string1.toCharArray();
		char chararray2[]=string2.toCharArray();
		
		if(chararray1.length!=chararray2.length){
			return false;
		}
		for (int i = 0; i < chararray1.length; i++) {
			for (int j = 0; j < chararray2.length; j++) {
				if(chararray1[i]==chararray2[j]){
					chararray2[j]='#';
					counter++;
					break;
				}
				
			}
			
		}
		if(counter==chararray1.length)
			return true;	
		return false;
	}
/**
 * 
 * @param number1
 * @param number2
 * @return boolean (true or false) 
 */
	public static boolean isAnagram(int number1,int number2) {
		int counter=0;
		int temp=number1;
		if(position(number1)==position(number2)) {
			int digit=number1;
			while(number1!=0) {
				digit=number1%10;
				if(findNumber(digit, number2))
					counter++;
				number1=number1/10;
			}
			if(counter==position(temp))
				return true;
			
		}
		return false;
	}
/**
 * 
 * @param digit
 * @param number2
 * @return
 */
	public static boolean findNumber(int digit,int number2) {
		int temp=number2;
		while(temp!=0) {
			if(digit==temp%10)
				return true;
			temp=temp/10;
		}
		return false;
	}
/**
 * 
 * @param number
 * @return
 */
	public static int position(int number) {
		if(number<10)
			return 1;
		else if(number<100)
			return 2;
		else if(number<1000)
			return 3;
		else if(number<10000)
			return 4;
		else
			return 0;
	}
/**
 * 
 * @param number
 * @return true or false (no. is prime or not)
 */
	public static boolean isPrime(int number) {
		int counter=0;
		for (int i = 1; i <=number; i++) {
			if(number%i==0) {
				counter++;
			
			}
		}
		if(counter==2)
			return true;
		return false;
	}
/**
 * 
 * @param low
 * @param high
 */
	public static void primeNumber(int low,int high) {
	for(int i=low;i<high;i++) {
		if(isPrime(i))
			System.out.println(i);
	}
		
		
	}
/**
 * 
 * @param string
 * @return
 */
	public static boolean isPallindrome(String string) {
		char ch[]=string.toCharArray();
		int counter=0;
		for (int i = 0; i < ch.length/2; i++) {
			if(ch[i]==ch[ch.length-1-i])  {
				counter++;
				break;
			}	
		}
		if(counter==ch.length/2)
			return true;
		return false;
	}
/**
 * 
 * @param number
 * @return
 */
	public static boolean isPallindrome(int number) {
		
		int reverseNumber=0;
		int temp=number;
		while(temp!=0) {
			reverseNumber=temp%10+reverseNumber*10;
			temp=temp/10;
			
		}		
		if(number==reverseNumber)
			return true;
		return false;
	}
	public static void dayOfWeek(int month,int day,int year) {
		int nyear=0,nday=0,nmonth=0;
		String strMonth[]={"","January","February","March","April"
		,"May","June","July","August","September","October","November","December"};
		String strDay[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		nyear=year-(14-month)/12;
		int temp=nyear+nyear/4-nyear/100+nyear/400;
		nmonth=month+12*((14-month)/12)-2;
		nday=(day+temp+31*nmonth/12)%7;
		
		System.out.println(strMonth[month]+" "+day+" "+strDay[nday]);
	
	}
	public static double temperatureConversionF(double temperature) {
		return (temperature*9)/5+32;
	}
	public static double temperatureConversionC(double temperature) {
		return (temperature-32)*5/9;
	}
	public static double monthlyPayment(double principal,double year,double rate) {
		double month=12*year;
		double rateOf=rate/(100*12);
		double payment=(principal*rateOf)/(1-Math.pow(1+rateOf,-month));
		return payment;
	}
	public static double sqrt(double number) {
		double t=number;
		double epsilon=1e-15;
		t=(number/t+t)/2;
		while(Math.abs(t - number/t) > epsilon*t) {
				t=(number/t+t)/2;
		
		}
		return t;
	
	}
	public static String toBinary(int number) {
		String binary="";
		int num=0;
		while(number!=0) {
			if(number%2==0) {
				binary="0"+binary;
				num=num*10+0;
			}
			else {
			
				binary="1"+binary;
				num=num*10+1;
			}
				number=number/2;
		
		}
			System.out.println("nume"+num);
		return binary;
	
	}
	public static void main(String args[]) {
	dayOfWeek(10,5,2017);
	System.out.println(temperatureConversionF(36));
	System.out.println(temperatureConversionC(98));
	System.out.println("payment="+monthlyPayment(1000,0.6,10));

	System.out.println("sqrt "+sqrt(35));
	System.out.println("Binary "+toBinary(5));
	String str=toBinary(32);
	System.out.println("Dec "+str.charAt(0));
	}
	
}

