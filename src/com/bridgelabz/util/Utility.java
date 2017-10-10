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
package com.bridgelabz.util;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgelabz.programs.BinarySearchMain;

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

	public static void binarySearch(int low,int high,int value) {
		int mid=(low+high)/2;
		System.out.println("Is Value  between 0 to mid="+mid+" ?");
		Scanner scanner=new Scanner(System.in);
		try {
			if(value==mid)
				System.out.println(mid+" found");
			else if(scanner.nextBoolean()) 
				binarySearch(low, mid-1, value);
			else
				binarySearch(mid+1, high, value);
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
	
	public static void main(String[] args) {
	
	int arr[]={1,15,0,55,6,5};
	int br[]={5,6,8,11,2};
	String g[]={"welcome","bcd","world"};

	String s1[]={"hello","how are you"};
	char s[]={'b','a','c'};
	char f[]={'f','g','a'};
	//char s[]=s1[1].toCharArray();

	for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");
	System.out.println();
	bubbleSort(s1);
	for(int i=0;i<s1.length;i++)
	System.out.print(s1[i]+" ");
	System.out.println();
	
	//System.out.println("positon="+binarySearch(s,'g'));
	//insertionSort(br);
	for(int i=0;i<br.length;i++)
		System.out.print(br[i]+" ");
	//insertionSort(f);
	for(int i=0;i<f.length;i++)
		System.out.print(f[i]+" ");

	insertionSort(g);
	for(int i=0;i<g.length;i++)
		System.out.print(g[i]+" ");
	System.out.println();
	
	System.out.println("positon="+binarySearch(g, "world"));
	
	
	}
	
}
