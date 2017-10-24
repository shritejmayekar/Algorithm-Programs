
package com.bridgelabz.util;

import java.util.InputMismatchException;
import java.util.Scanner;
/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/Utility.java
 *  Execution:    java -cp bin com.bridgelabz.programs.Utility
 *  
 *  Purpose: To perform different functionalities like sorting ,searching,etc
 *  	
 *  		
 *  			
 *  			
 *  @author  Shritej
 *  @version 1.0
 *  @since   03-10-2017
 *
 ******************************************************************************/
public class Utility {
/**
 * bubbleSort method to sort the element of generic type
 * @param array
 */

	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
		T temp;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i].compareTo(array[j])>0) {
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
	}
	
/**
 *binarySearch method to find value present in array or not
 * @param array
 * @param value
 * @return (-1 for not found else position of element)
 */
	public static <T extends Comparable<T>> int binarySearch(T[] array,T value) {
	
		int low=0,mid;
		int high=array.length;
		while(low<=high) {	
			mid=(low+high)/2;
			if(array[mid].compareTo(value)==0)
				return mid;
			else if(value.compareTo(array[mid])>0)
				low=mid+1;
			else 
				high=mid-1;

		}
				
		return -1;
	
	
	}
/**
 * binary search method to find range of value by asking question and guessing game
 * 	with an user interaction
 * @param low
 * @param high
 * @param value
 */

	public static void binarySearch(int low,int high) {
	
		int mid=(low+high)/2;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Is Value  between "+low+" to mid="+mid+" ?");
		try {
			if(low==high)
				System.out.println(mid+" found");
			else if(scanner.nextBoolean()) 
				binarySearch(low, mid);
			else
				binarySearch(mid+1, high);
		}
		catch(NumberFormatException exceptionNumberformat) {
			System.out.println("Exception:"+exceptionNumberformat);
		}
		catch(InputMismatchException exceptionInput) {
			System.out.println("Exception:"+exceptionInput);
		}
		catch(Exception exception) {
			System.out.println("Exception:"+exception);
		}
		
	}
/**
 * insertionSort method to sort the element  generic type
 * @param array
 */
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		T elementToinsert;
		int pos;
		for (int i = 1; i < array.length; i++) {
			elementToinsert=array[i];
			pos=i;
			while((pos>0)&&(array[i-1].compareTo(elementToinsert)>0) ) {
				array[pos]=array[pos-1];
				pos=pos-1;
			}
			array[pos]=elementToinsert;
			
		}
		
	
	}
/**
 * mergeSort method to sort the elements generic type
 * @param array
 */
	public static void mergeSort(String[] array) {
		if(array==null) {
			return;
		}
		if(array.length>1) {
			/* divide array i n half */
			int mid=array.length/2;
			/* left array */
			String[] leftArray=new String[mid];
			/* right array */
			String[] rightArray=new String[array.length-mid];
			
			/*copy array elements halfly in left array*/
			for (int i = 0; i <mid; i++) 
				leftArray[i]=array[i];
			/*copy array elements next halfly in right array*/
			for (int i =mid; i <array.length; i++)
				rightArray[i-mid]=array[i];
			//call merge sort method till completely divides the array*/	
			mergeSort(leftArray);
			mergeSort(rightArray);
			
			int i=0;
			int j=0;
			int k=0;
			/*merge left and right array*/
			while(i<leftArray.length && j<rightArray.length) {
				if((leftArray[i].compareTo(rightArray[j])<0) )
					array[k++]=leftArray[i++];
			
				else
					array[k++]=rightArray[j++];
				
			}
			/* merge remaining parts */
			while(i<leftArray.length)
				array[k++]=leftArray[i++];
			while(j<rightArray.length)
				array[k++]=rightArray[j++];
			
		}
		
	
	}

	
	public static void main(String[] args) {
	
	int arrayOne[]={1,15,0,55,6,5};
	int secondArray[]={5,6,8,11,2};
	String stringArray[]={"welcome","bcd","world"};

	String stringArrayTwo[]={"hello","how are you"};
	char characterOne[]={'b','a','c'};
	char characterTwo[]={'f','g','a'};

	for(int i=0;i<arrayOne.length;i++)
	System.out.print(arrayOne[i]+" ");
	System.out.println();
	bubbleSort(stringArrayTwo);
	for(int i=0;i<stringArrayTwo.length;i++)
	System.out.print(stringArrayTwo[i]+" ");
	System.out.println();
	
	
	for(int i=0;i<secondArray.length;i++)
		System.out.print(secondArray[i]+" ");
	
	for(int i=0;i<characterTwo.length;i++)
		System.out.print(characterTwo[i]+" ");

	insertionSort(stringArray);
	for(int i=0;i<stringArray.length;i++)
		System.out.print(stringArray[i]+" ");
	System.out.println();
	
	System.out.println("positon="+binarySearch(stringArray, "world"));
	
	
	}
	
}
