//Name: Yibo Wang
//OPUS ID: Ywan738
//Student ID: 2203982
//Collaboration Statement: I collaborated with Dilsher Dhupia. 

import java.io.*;
import java.util.Scanner;
 
//specify the import statements needed to use
//a Scanner object and File objects


public class Words {
	// add a throws exception to the main method
	public static void main(String[] args) throws IOException {
		int wordCount = 0;
		int lineCount = 0;
		
		File poePoem = new File("poe.txt");
		//declare and initialize a file built from poe.txt
		Scanner in = new Scanner(poePoem);
		//declare and initialize a Scanner which reads the File object
		
		//write a while-loop to count all *words* in the file
		
		String x;
		while (in.hasNext()){
		x = in.next();
		wordCount++;
		}
		
		in = new Scanner(poePoem);
		//reset your Scanner
		
		while (in.hasNextLine()){
		x = in.nextLine();
		lineCount++;
		}
				
		//write a while-loop to count all *lines* in the file
		
		System.out.println("Total words = " + wordCount);
		System.out.println("Total lines = " + lineCount);
	}
}
