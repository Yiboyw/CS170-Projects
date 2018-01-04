/* Name: Yibo Wang
OPUS ID: ywan738
Student #: 2203982
Collaboration Statement: I used the Think Java @ Emory course textbook. */

import java.util.Scanner;
import java.io.*;


public class Lab8{

	public static void main (String[] args) throws IOException {
		File myFile = new File("nums.txt");	
		Scanner in = new Scanner(myFile);
		
		int sum = 0;
		
		int commandCount = 0;
		
		int first = Integer.parseInt(args[0]); // This converts the first number the user puts in the command line from a string to integer. 
		int second = Integer.parseInt(args[1]); // This converts the second number the user puts in the command line from a string to integer.
				
			while (commandCount < first) {
			
			int x = in.nextInt();
			sum = sum + x;
				int numCount = 1;	
				
				while (numCount % second != 0) { 
				x = in.nextInt();
				/*Since the program starts by adding the first digit, 
				if the modulo of the numCount divided by the second command line is one, this will let the program know to add the sum again. */
					numCount++; 				
					
				}
			
			commandCount++;
			}
				
			System.out.println(sum);	
		}
			
}

 		


		
	
			


			
	


