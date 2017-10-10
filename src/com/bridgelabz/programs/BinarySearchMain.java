/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/BinarySearchMain.java
 *  Execution:    java -cp bin com.bridgelabz.programs.BinarySearchMain
 *  
 *  Purpose: To do sort,binary search for string and integer
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

import com.bridgelabz.util.StopWatch;
import com.bridgelabz.util.Utility;

public class BinarySearchMain {
	/*Declaration */
	public static int position,positionString;
	public static Integer[] unSortedIntegerArray=new Integer[5];
	public static String[] unSortedStringArray=new String[5];
	public static Scanner scanner=new Scanner(System.in);
/**
 * readArrayInteger method reads Interger value type
 */
	public static void readArrayInteger() {
		System.out.println("please specify size of array");
		unSortedIntegerArray=new Integer[scanner.nextInt()];
		System.out.println("please enter element");
		for (int i = 0; i < unSortedIntegerArray.length; i++) {
			unSortedIntegerArray[i]=scanner.nextInt();
		}
		
	}
/**	 
 * readArraystring method reads String value type
 */
	public static void readArrayString() {
		System.out.println("please specify size of array");
		unSortedStringArray=new String[scanner.nextInt()];
		System.out.println("please enter element");
		for (int i = 0; i < unSortedStringArray.length; i++) {
			unSortedStringArray[i]=scanner.next();
		}
		
	}
	public static void main(String[] args) {
		while(true) {
			System.out.println("\nplease enter choice \n1.readIntegerArray"
					+ "\n2.readStringArray"
					+ "\n3.bubbleSort Integer"
					+ "\n4. bubbleSort String"
					+ "\n5.insertionSort Integer"
					+ "\n6.insertionSort String"
					+ "\n7..search Integer element"
					+ "\n8.search String element"
					+ "\n9.exit");
			switch (scanner.nextInt()) {
				case 1:readArrayInteger();
				
						break;
				case 2:readArrayString();
						break;
						
				case 3:StopWatch.start();
						Utility.bubbleSort(unSortedIntegerArray);
						for(int sortedArrayBubble:unSortedIntegerArray)
								System.out.print(sortedArrayBubble+" ");
						StopWatch.stop();
						StopWatch.showElapse();
									break;
				case 4:StopWatch.start();
						Utility.bubbleSort(unSortedStringArray);
						for(String sortedArrayBubble:unSortedStringArray)
								System.out.print(sortedArrayBubble+" ");
						StopWatch.stop();
						StopWatch.showElapse();
				break;
				case 5:	StopWatch.start();
						Utility.insertionSort(unSortedIntegerArray);
						for(int sortedArrayInsertion:unSortedIntegerArray)
							System.out.print(sortedArrayInsertion+" ");
						StopWatch.stop();
						StopWatch.showElapse();
								break;
				case 6:	StopWatch.start();
						Utility.insertionSort(unSortedStringArray);
						for(String sortedArrayInsertion:unSortedStringArray)
							System.out.print(sortedArrayInsertion+" ");
						StopWatch.stop();
						StopWatch.showElapse();
								break;
				case 7:
						System.out.println("\nplease enter element to search:");
						StopWatch.start();
						position=Utility.binarySearch(unSortedIntegerArray,scanner.nextInt());
						if(position==-1)
							System.out.println("element not found");
						else
							System.out.println("element at position:"+position);
						StopWatch.stop();
						StopWatch.showElapse();
		
								break;
				case 8:System.out.println("\nplease enter element to search:");
						StopWatch.start();
						positionString=Utility.binarySearch(unSortedStringArray,scanner.next());
						if(positionString==-1)
							System.out.println("element not found");
						else
							System.out.println("element at position:"+positionString);
						StopWatch.stop();
						StopWatch.showElapse();
						break;
				case 9:System.exit(0);
				break;
		
				default:System.out.println("invalid");
				break;
			}
			
		}
		

	}

}
