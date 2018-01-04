/* Name: Yibo Wang
UserID: ywan738
Section: 006
Collaboration Statement: I used the Think Java @ Emory textbook and collaborated with Jason Kang & Alice Yoon. 
*/

public class HW3 {
	
	public static void main(String[] args) {
		
		int streetStop = 29;
		//Based on the number you put into the BusStop program, it will tell you the nearest bus stop. 
		System.out.println("The closest bus stop is on street "+ closestBusStop(streetStop)+"." );
		

		double money = 90.0;
		//Based on the number of cents you put into the numNickels program, it will tell you the number of nickels
	    	System.out.println("The number of nickels is " + numNickels(money)+".");
		
		int x = 121100;
		//Based on the lottery number you entered, the program will tell you if it is true or false. 
		System.out.println(ticket(x));
		
			    
	    	int tripleResult = triple(1,3,5);
	    	//Based on the three numbers you put in the dice program, it will tell you the number of points you earned.  
	    	System.out.println("The total number of points you earn from this dice game is " + tripleResult +".");
	    

	    	loaded();
	    	int diceRoll = loaded();
	    	System.out.println("The number the dice program rolled is " + diceRoll +".");
	    	//The loaded dice roll program generates random numbers from 1-6 based on the probabilities given for each number in the HW3.pdf.  
	}
	
		public static int closestBusStop(int streetStop) {
				
		int remain = streetStop % 8;
				
		if (remain <= 4) {
	        return (streetStop-remain); 
	        // This return value is the streetStop number that was entered added to the remainder of 8, which gives the closest bus stop. 
					 
		}
		else 
	   	    return (streetStop+(8-remain));
	   	// This return value is the streetStop number that was entered added to the remainder of 8, which gives the closest bus stop.  
	   	    
	   	    /*The point of this closestBusStop program is to print out the nearest bus stop of the number 
	         you entered for the integer variable streetStop. */
	   					
		}
		
		public static double numNickels(double money) {
						
			double quarter = money % 25;//17.0
			double dimes = quarter % 10;  //7.0
			int numberofNickels = (int) dimes/5;
		    	return numberofNickels;		
				//This return value returns the remainder of the money divided by quarters divided by the number of dimes. 
		
				/*The point of this numNickels program is to print the number of nickels 
		    	you get in change based on the value of the double variable money. */
		
		}
		
		public static boolean ticket(int x) {
			
			//x=123456
			int a = (x%1000000 - x%100000)/100000; //(123456 - 23456)/100000 = 1
			int b = (x%100000- x%10000)/10000; 
			int c = (x%10000-x%1000)/1000; 
			int d = (x%1000- x%100)/100; 
			int e = (x%100- x%10)/10; // (56-6)/10 = 5
			int f = x%10; //6
			// Basically this whole section of code isolates the number in each ones, tenth, hundredths, 
			//thousands, ten thoudsandths, and hundred thousandths place of the lottery number entered. 
			
			int count = 0;
			
			if (a == c) {
			count = count+1;
			}	
			if (a == d) {
			count = count+1; 
			}
			if (a == e) {
			count = count+1;
			}
			if (a == f) {
			count = count+1;
			}
			
			if (count == b) {
 			return true;
			//This part of the program counts the number of times the first number of the lottery(given the variable a) is counted in the last 4 				digits. Then this count is compared to the second lottery number, which is given the variable b. 
			}
			if (x < 100000) {
			return false; // If number is a negative number or not a 6 digit number, return false. 
			}
			else {
			return false;
			}
		}
		
		public static int triple(int a, int b, int c) {
			
			if (a == b && c == a) { 
				//If all numbers equal each other, you get 100 points. 
				return 100;
			}
			if (a==1 && b==1 || a==1 && c==1 || b==1 && c==1  ) {
				return 45;
				//If two of the numbers equal 1, you get 45 points. 
			}
			if (a==3 && b==3 || a==3 && c==3 || b==3 && c==3  ) {
				return 45;
				//If two of the numbers equal 3, you get 45 points. 
			}
			if (a==6 && b==6 || a==6 && c==6 || b==6 && c==6  ) {
				//If two of the numbers equal 6, you get 45 points. 
				return 45;
			}
			if (a/2 ==0 && b/2 == 0 && c/0 ==0) {
				//If all number are even, you get 20 points. 
				return 20;
			}
			if (a/2 !=0 && b/2 != 0 && c/0 !=0) {
				//If all number are even, you get 20 points. 
				return 20;
			}	
				else if (a+b == c || b+c==a || c+a ==b) {
					//If two of the numbers add up to the other one, you get 10 points. 
				return 10;
			}
			else {
				//If none of these conditions are true, you get 0 points. 
				return 0;
			}
				
		}
		
		public static int loaded() {
			
			int x = (int)((Math.random()*99) +1); // This generates numbers from 1-100. 
			
			if (x<=25) {
				return 1; 
			//There is a 25% of the dice program returning 1 since the program returns 1 if the number generated is between [1,25]. 
			}
			if (x > 25 && x<=50) {
				return 2 ; 
			// There is a 25% of the dice program returning 2 since the program returns 2 if the number generated is between (25,50]. 
			}
			if (x>50 && x<=70 ) {
				return 3; //There is a 20% of the dice program returning 3 since the program returns 2 if the number generated is between (50,70]. 
			}
			if (x>70 && x<=85) {
				return 4; //There is a 15% of the dice program returning 4 since the program returns 2 if the number generated is between (25,50]. 
			}
			if (x>85 && x<=95){
				return 5; //There is a 10% of the dice program returning 5 since the program returns 2 if the number generated is between (85,95]. 
			}
			else {
					return 6; 
			//There is a 5% of the dice program returning 6 since the program returns 2 if the number generated is between (95,100]. 
			
			}
			
			
			
			
			
			
			
		}

		

}




		
	


	
