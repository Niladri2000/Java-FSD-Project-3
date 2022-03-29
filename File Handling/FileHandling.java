package com.simplilearn.demo;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileHandling {

	public static void main(String[] args) {
	char ch;
	
	try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a word: 'w-To Write, r-To Read, a-To Append' a file");
		  ch=sc.next().charAt(0);
		switch(ch) {
		case 'w':
		{
		  System.out.println("Enter the text that you want to write in the file:");
		  sc.nextLine();
		  String text = sc.nextLine();
		  FileWriter fWriter = new FileWriter("F:\\Files\\testFile1.txt");
		  fWriter.write(text);
		  fWriter.close();
		  System.out.println("Congratulations!!File with your given data had been written successfully");
		  break;
		}
		case 'r':
		{
			FileReader fr=new FileReader("F:\\Files\\testFile1.txt");
			int i;
			while((i=fr.read())!=-1)
			System.out.print((char)i);
			fr.close();
			break;
		}
		case 'a':
		{
			PrintWriter pw=new PrintWriter("F:\\Files\\testFile1.txt");
			pw.append("This is the sentence that will be formed after appending the given file");
			System.out.println("The given file has been appended");
			pw.flush();
			break;
		}
		default:
			System.out.println("Sorry, you've entered an Invalid character");
			break;
		}
	}
	 catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
  }
}
