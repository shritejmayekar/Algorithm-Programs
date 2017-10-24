/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/Util.java
 *  Execution:    java -cp bin com.bridgelabz.programs.Util
 *  
 *  Purpose: To perform different functionalities
 *  	
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.util.Random;


public class Util {
	/*Declaration */

	public static int[] notes={1000,500,100,50,20,10,5,2,1};
	public static int[] changeNotes=new int[9];
	/**
	 * isAnagram checks oneWord is arrangement of wordTwo
	 * @param wordOne
	 * @param wordTwo
	 * @return
	 */
	public static boolean isAnagram(String wordOne,String wordTwo) {
		int counter=0; 
		/* 
		 * Remove space
		 */
		wordOne=wordOne.replaceAll("\\s","");
		wordTwo= wordTwo.replaceAll("\\s","");
		/*
		 * convert to lower case
		 */
		wordOne=wordOne.toLowerCase();
		wordTwo= wordTwo.toLowerCase();
		/*
		 * String to char array conversion
		 */
		char chararray1[]=wordOne.toCharArray();
		char chararray2[]=wordTwo.toCharArray();
		
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
 * isAnagram method to find two number as anagram
 * @param numberOne
 * @param numberTwo
 * @return boolean (true or false) 
 */
	public static boolean isAnagram(int numberOne,int numberTwo) {
		int counter=0;
		int temp=numberOne;
		if(position(numberOne)==position(numberTwo)) {
			int digit=numberOne;
			while(numberOne!=0) {
				digit=numberOne%10;
				if(findNumber(digit, numberTwo))
					counter++;
				numberOne=numberOne/10;
			}
			if(counter==position(temp))
				return true;
			
		}
		return false;
	}
/**
 * findNumber method to find same digit present in other number
 * @param digit
 * @param numberTwo
 * @return
 */
	public static boolean findNumber(int digit,int numberTwo) {
		int temp=numberTwo;
		while(temp!=0) {
			if(digit==temp%10)
				return true;
			temp=temp/10;
		}
		return false;
	}
/**
 * position method will finds the position of digit number
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
 * prime method to check prime number
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
 * primeNumber method is extension of isPrime which give range of prime number
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
 * anagram and pallindrome method for finding number which is anagram and pallindrome 
 * @param low
 * @param high
 */
	public static void anagramAndPallindrome(int low,int high) {
		int []primeNumberArray=new int[high];
		int k=0;
		
		for(int i=low;i<high;i++) {
			if(isPrime(i))
			{
				primeNumberArray[k++]=i;
				
			}
		}
		
		System.out.println("=======Anagram And Pallindrome Number=====");
		for(int i=0;i<k;i++) {
			for(int j=1;j<k;j++) {
				if(primeNumberArray[i]!=primeNumberArray[j])
					if(isAnagram(primeNumberArray[i], primeNumberArray[j]))
						if(reverseNumber(primeNumberArray[i])==primeNumberArray[j])
							System.out.println(primeNumberArray[i]+" "+primeNumberArray[j]);
			}
		}
			
			
	}
/**
 * isPalindrome for string ,find string pallindrome or not
 * @param string
 * @return
 */
	public static boolean isPallindrome(String string) {
		char characterArray[]=string.toCharArray();
		int counter=0;
		for (int i = 0; i < characterArray.length/2; i++) {
			if(characterArray[i]==characterArray[characterArray.length-1-i])  {
				counter++;
				
			}	
		}
		if(counter==characterArray.length/2)
			return true;
		return false;
	}
/**
 * isPallindrome for integer, find number is pallindrome or not
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
/**
 * reversNumber method reverse the number
 * @param number
 * @return
 */
public static int reverseNumber(int number) {
		
		int reverseNumberReturn=0;
		int temp=number;
		while(temp!=0) {
			reverseNumberReturn=temp%10+reverseNumberReturn*10;
			temp=temp/10;
			
		}		
		return reverseNumberReturn;
		}


/**
 * dayOfWeek method to display moth and day
 * @param month
 * @param day
 * @param year
 */
	public static void dayOfWeek(int month,int day,int year) {
		int nyear=0;
		int nday=0;
		int nmonth=0;
		String strMonth[]={"","January","February","March","April"
		,"May","June","July","August","September","October","November","December"};
		String strDay[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		nyear=year-(14-month)/12;
		int temp=nyear+nyear/4-nyear/100+nyear/400;
		nmonth=month+12*((14-month)/12)-2;
		nday=(day+temp+31*nmonth/12)%7;
		
		System.out.println(strMonth[month]+" "+day+" "+strDay[nday]);
	
	}
/**
 * 
 * @param temperature
 * @return
 */
	public static double temperatureConversionF(double temperature) {
		return (temperature*9)/5+32;
	}
/**
 * 
 * @param temperature
 * @return
 */
	public static double temperatureConversionC(double temperature) {
		return (temperature-32)*5/9;
	}
/**
 * 
 * @param principal
 * @param year
 * @param rate
 * @return
 */
	public static double monthlyPayment(double principal,double year,double rate) {
		double month=12*year;
		double rateOf=rate/(100*12);
		double payment=(principal*rateOf)/(1-Math.pow(1+rateOf,-month));
		return payment;
	}
/**
 * sqrt method gives the square root of number
 * @param number
 * @return
 */
	public static double sqrt(double number) {
		double t=number;
		double epsilon=1e-15;
		t=(number/t+t)/2;
		while(Math.abs(t - number/t) > epsilon*t) {
				t=(number/t+t)/2;
		
		}
		return t;
	
	}
/**
 * toBinary method converts decimal to binary
 * @param number
 * @return 
 * 
 */
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
		swapNimble(binary);	
		return binary;
	
	}
	public static void printBinaryTodecimal(int[] binaryArrray) {
		int sum=0;
		int bit=7;
		for(int i=0;i<binaryArrray.length;i++) {
			if(binaryArrray[i]==1) {
				sum=(int) (sum+Math.pow(2, bit));
			}
			bit--;
			
		}
		System.out.println("The decimal number="+sum);
	}
	public static void swapNimble(String binary) {
		int[] binaryBitArray=new int[8];
		int[] swapNimbelArray=new int[8];
		
		for(int i=0;i<binary.length();i++) {
			if(binary.charAt(i)=='1')
				binaryBitArray[binaryBitArray.length-binary.length()+i]=1;
				else
				binaryBitArray[binaryBitArray.length-binary.length()+i]=0;
		}	
		printBinaryTodecimal(binaryBitArray);
		for(int i=0;i<binaryBitArray.length;i++) {
			if(i<4)
				swapNimbelArray[i]=binaryBitArray[4+i]; 
			else
				swapNimbelArray[i]=binaryBitArray[i-4];
		}
		printBinaryTodecimal(swapNimbelArray);
		
	}
	
/**
 * calMoney method just calcalutes money as minimum notes in change
 * @param changeOfAmount
 */
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
/**
 * returnNotes method will return the notes needed according to denomination
 */
	public static void returnNotes() {
		System.out.println("Notes reurned by vending machine");
		for(int i=0;i<changeNotes.length;i++) {
			System.out.println("Note of "+notes[i]+" X "+changeNotes[i]);
		}
	}
/**
 * amountChange method will calculates the amount change as vending machine
 * @param amount
 */
	public static void amountChange(int amount) {
	while(amount>0) {
		for(int i=0;i<9;i++) {
			if(amount>=notes[i]) {
				amount=amount-notes[i];
				//System.out.print(notes[i]+" ");
				changeNotes[i]=changeNotes[i]+1;
				break;
			}
		}
	}
	returnNotes();
	}
	
	
/**
 * randomGenerator generates random number
 * @return
 */
	public static int randomGenerator() {
		Random random=new Random();
		return random.nextInt(100);
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

