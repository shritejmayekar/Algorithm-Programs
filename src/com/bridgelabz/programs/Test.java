package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException  {
	File file=new File("helloFile.txt");
	if(file.createNewFile())
		System.out.println("File is created successfully");
	else
		System.out.println("File already exist");
	FileWriter fileWriter=new FileWriter(file);
	fileWriter.write("this is first file demo");
	fileWriter.close();
	FileReader fileReader=new FileReader("helloFile.txt");
	BufferedReader bufferedReader=new BufferedReader(fileReader);
	String s;
	while((s=bufferedReader.readLine())!=null) {
		System.out.print(s);
	}

	fileReader.close();
		
	}

}
