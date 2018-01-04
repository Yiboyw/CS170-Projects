/*Student Name: Yibo Wang
Emory userID: ywan738
Student ID: 2203982
Section: 006 
Collaboration Statement: I used the textbook, 10 hours of my life, and help from Henry Wang - one of the Intro to CS teaching assitants.*/

public class HW2 {
		public static void main(String[] args) {
			
			totemHead();
		}

				public static void totemHead() {
				double rand = Math.random();
				int part1 = (int)(3* Math.random());
				int part2 = (int)(3* Math.random());
				int part3 = (int)(3* Math.random());
				int part4 = (int)(3* Math.random());

				if ( part1 == 0) {
				System.out.println( hair1() );
				}
 				if ( part1 == 1) {
				System.out.println( hair2() );
				}
							
				if ( part1 == 2) {
				System.out.println( hair3() );
				}

				if ( part2 == 0) {
				System.out.println( eyes1() );
				}
 				if ( part2 == 1) {
				System.out.println( eyes2() );
				}
							
				if ( part2 == 2) {
				System.out.println( eyes3() );
				}
				
				
				if ( part3 == 0) {
				System.out.println( nose1() );
				}
 				if ( part3 == 1) {
				System.out.println( nose2() );
				}
				if ( part3 == 2) {
				System.out.println( nose2() );
				}			
				

				if ( part4 == 0) {
				System.out.println( mouth1() );
				}
 				if ( part4 == 1) {
				System.out.println( mouth2() );
				}
							
				if ( part4 == 2) {
				System.out.println( mouth3() );
				}
				//This part generates one random Totem head.


				if ( part1 == 0) {
				System.out.println( hair2() );
				}
 				if ( part1 == 1) {
				System.out.println( hair1() );
				}
							
				if ( part1 == 2) {
				System.out.println( hair3() );
				}

				if ( part2 == 0) {
				System.out.println( eyes2() );
				}
 				if ( part2 == 1) {
				System.out.println( eyes1() );
				}
							
				if ( part2 == 2) {
				System.out.println( eyes3() );
				}


				if ( part3 == 0) {
				System.out.println( nose2() );
				}
 				if ( part3 == 1) {
				System.out.println( nose1() );
				}
				if ( part3 == 2) {
				System.out.println( nose2() );
				}			
				

				if ( part4 == 0) {
				System.out.println( mouth2() );
				}
 				if ( part4 == 1) {
				System.out.println( mouth1() );
				}
							
				if ( part4 == 2) {
				System.out.println( mouth3() );
				}
				//This part generates the second random Totem head.

				if ( part1 == 0) {
				System.out.println( hair3() );
				}
 				if ( part1 == 1) {
				System.out.println( hair1() );
				}
							
				if ( part1 == 2) {
				System.out.println( hair2() );
				}

				if ( part2 == 0) {
				System.out.println( eyes3() );
				}
 				if ( part2 == 1) {
				System.out.println( eyes1() );
				}
							
				if ( part2 == 2) {
				System.out.println( eyes2() );
				}


				if ( part3 == 0) {
				System.out.println( nose2() );
				}
 				if ( part3 == 1) {
				System.out.println( nose1() );
				}
				if ( part3 == 2) {
				System.out.println( nose2() );
				}			
				

				if ( part4 == 0) {
				System.out.println( mouth3() );
				}
 				if ( part4 == 1) {
				System.out.println( mouth1() );
				}
							
				if ( part4 == 2) {
				System.out.println( mouth2() );
				}

				//This part generates the third random Totem head.
			}

				public static String hair1() {
					return "||||||||||||||||\n|______________|";
					//This method makes straight hair.
				}

				public static String hair2() {
					return "|^^^^^^^^^^^^^^|\n|______________|";
					//This method makes spiky hair.
				}
				
				public static String hair3() {
					return "|&&&&&&&&&&&&&&|\n|______________|";
					//This method makes curly hair.
				}

				public static String eyes1() {
					return "|  |--|  |--|  |";
					//This method makes straight eyes.
				}
				
				public static String eyes2() {
					return "|--|OO|-|OO|---|";
					//This method makes circle eyes.
				}
				
				public static String eyes3() {
					return "|  (-)   (-)   |";
					//This method makes small eyes.
				}
			
				public static String nose1() {
					return "|     (.)      |";
					//This method makes a nose. 
				}
				
				public static String nose2() {
					return "|              |";
					//This method makes no nose. 
				}
				public static String mouth1() {
					return "|  (oooooooo)  |\n|______________|";
					//This method makes a surprised mouth.
				}
				
				public static String mouth2() {
					return "|   (mmmmmm)   |\n|______________|";
					//This method makes angry mouth.
					}
	
				public static String mouth3() {
					return "|   (bbbbbb)   |\n|______________|";
					//This method makes silly mouth.
				}


	 
}
				
