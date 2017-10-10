/******************************************************************************
 *  Compilation:  javac -d . com/bridgelabz/programs/BinarySearchWordListFile.java
 *  Execution:    java -cp bin com.bridgelabz.programs.BinarySearchWordListFile
 *  
 *  Purpose: To do search from file sort it and then binary search
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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class BinarySearchWordListFile {
	public static Scanner scanner=new Scanner(System.in);
	public static String[] fileArrayContent=new String[5];
	public static int sizeOfArray,position;
	public static String readFileContent;
	public static void main(String[] args) throws IOException {
		File file=new File("demo.txt");
		FileWriter fileWriter=new FileWriter(file);
		FileReader fileReader=new FileReader(file);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
	
	

		if(file.createNewFile())
			System.out.println("File is created successfull");
		else
			System.out.println("File already exists");
		
		System.out.println("Enter the content in file");
		fileWriter.write(scanner.nextLine());
		fileWriter.close();
		
		while((readFileContent=bufferedReader.readLine())!=null) {
			System.out.print(readFileContent+" ");
			fileArrayContent[sizeOfArray++]=readFileContent;
		}
		bufferedReader.close();
		Utility.insertionSort(fileArrayContent);
		for(int i=0;i<fileArrayContent.length;i++)
			System.out.print(fileArrayContent[i]+" ");
		/*System.out.println("Enter word to search");
		position=Utility.binarySearch(fileArrayContent, scanner.next());
		if(position==-1) 
			System.out.println("word not found");
		else
			System.out.println("Word found at position "+position);
*/
	}

}
