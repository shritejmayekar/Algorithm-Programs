package com.bridgelabz.programs;

import java.io.*;
public class Filetest {

   public static void main(String args[])throws IOException {
      File file = new File("Hello1.txt");
      
      // creates the file
      file.createNewFile();
      
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 
      
      // Writes the content to the file
      writer.write("This is an example"); 
      writer.flush();
      writer.close();

      // Creates a FileReader Object
      FileReader fr = new FileReader(file); 
      char [] a = new char[50];
      fr.read(a);   // reads the content to the array
     String string="a";
      for(char c : a)
      {
         System.out.print(c);
        
        	 
         
      }// prints the characters one by one
      fr.close();
      
    	  System.out.println(string);
   }
}
