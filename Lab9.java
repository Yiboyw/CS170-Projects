/* Name: Yibo Wang
OPUS ID:ywan738
Section #: 006
Collaboration Statement: I used the Think @ Java textbook and collaborated with Rohan Bansal, Brittany Nixon, and Jason Kang. */

import java.util.Arrays;

public class Lab9 {
	public static void main(String[] args) {
		int firstCommand = Integer.parseInt(args[0]);
		int[] a = new int[firstCommand];	
		fillRandom(a); //This calls the fillRandom method and passes the array a into the method. 
		minGap(a); //This calls the minGap method and passes the array a into the method. 
	}
	public static void fillRandom(int[] array) {
		
		for (int i = 0; i <array.length;i++) {
			array[i] = ((int)(Math.random()*50)+1); 
		//This creates an array filled with random numbers from 0-50. 
				
		}
		System.out.println(Arrays.toString(array));
	}
	public static int minGap(int[] array2) {
		int minimum = Math.abs(array2[1] - array2[0]); 
			//This just finds the difference of the first two integers in the array.

		int maximum = 0; 
		//This is just to initialize the variable maximum, which will takes the maximum difference in the array. 
		for (int i =1; i<array2.length;i++) {
			maximum = Math.abs(array2[i] - array2[i-1]);
			//This finds the difference between all the integers in the array.
			if (minimum > maximum) {
				minimum = maximum;
			}
		}
		System.out.println("The minimum gap is " + minimum + ".");	
		return minimum;	
	}
}
