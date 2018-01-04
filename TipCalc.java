/* Name: Yibo Wang 
UserID: ywan738
Section number:006 
I used only the Think Java @ Emory textbook.*/

import java.util.Scanner;

public class TipCalc {
	
	public static void main (String [] args) {
		Scanner waff = new Scanner(System.in); //imports a scanner for waffles
		System.out.println("How many waffles did you buy?");
		int w = waff.nextInt();
		
		Scanner hashbrown = new Scanner(System.in); //imports a scanner for hashbrowns
		System.out.println("How many hashbrowns did you buy?");
		int h = hashbrown.nextInt();
		
		double waffle = w*3.35;	//Finds the cost of waffles. Each waffle is $3.35. 
		double hash = h*1.45;  //Finds the cost of hashbrowns. Each hashbrown $is 1.45. 
		
						
		System.out.println("You bought "+w+" waffles and "+h+" hashbrowns.");
		System.out.println("Calculated bill before tip: $" + (waffle+hash));    		
	
		double tip1 = hash*0.15 + waffle*0.15; //Calculates tip based on 0.15 rate. 
		double tip2 = hash*0.17 + waffle*0.17; //Calculates tip based on 0.17 rate. 
		double tip3 = hash*0.20 + waffle*0.20; //Calculates tip based on 0.20 rate. 
		
		
		if (hash+waffle <= 20) { 
		   	
			System.out.println("Calculated tip: $" + tip1)	;	
			System.out.println("Total bill is "+ (hash+waffle+tip1) + " rounded up to " +  Math.ceil(hash+waffle+tip1) );
			
		}
			
		if (0<hash+waffle && hash+waffle<=30) {
			
			System.out.println("Calculated tip: $" + tip2);    	
			System.out.println("Total bill is "+ (hash+waffle+tip2) + " rounded up to " +  Math.ceil(hash+waffle+tip2) );
		}
			
		if (hash + waffle > 30) {
			
			System.out.println("Calculated tip: $" + tip3);    	
			System.out.println("Total bill is "+ (hash+waffle+tip3) + " rounded up to " +  Math.ceil(hash+waffle+tip3) );
		

		//These if statements account for the different tax percentages. 	
		}
		
		
	}

/*The point of this program is to first store the number of hashbrowns and waffles you ate the WaffleHouse. Then it calculates the cost of waffles and hashbrowns, the tip, and the total cost rounded to an integer. 
*/
			
}
	
	

