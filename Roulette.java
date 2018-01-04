/*Name: Yibo Wang
OPUS ID: ywan738
Section #: 006
Collaboration Statement: I used the Java Textbook & collaborated with the TA Chris. 
*/
 
public class Roulette {

   public String[] value; 
   public String[] color;

   public int outcome;

   /* ================================================
      This Roulette method creates the value & color arrays. 
      ================================================ */
   public Roulette( ) {
	
	value = new String[38];
	color = new String[38];

	for (int i =0; i < 38; i++) {//This Creates the value array. It goes from 1 to 38.
		
		if (i == 37) {//If i ==37, the array index is 00. 
		value[i] = "00";
		} 
	
		else {
		value[i] = i + ""; //Otherwise, the index is just the array number. 
		}
	}

   	for (int i =0; i < 38; i++) {
		
		if ((i == 0) || (i == 37)) {//If the array index is either 0 or 37, the element of the index is green. 
		color[i] = "G";
		}
	
		else if (i%2 == 0 && i<=10) { //If the array index is even and is less than or equal to 10, the element of the index is black. 
		color[i] = "B";
		}

		else if (i%2 != 0 && i<=9) { //If the array index is odd and is less than or equal to 9, the element of the index is red. 
		color[i] = "R";
		}

		else if (i%2 == 0 && i>10) {//If the array index is even and is greater than 10, the element of the index is red. 
		color[i] = "R";
		}
		else if (i%2 != 0 && i>9) {//If the array index is odd and is greater than 9, the element of the index is black. 
		color[i] = "B";
		}
	}
   }
   /* ================================================
      This spin() method uses the Math.random( method to generate numbers from 0-37
      ================================================ */
   public void spin() {
   outcome = (int)(Math.random()*38); ///Multiples Math.random by 38 to generate [0,38) which is numbers from 0-37. 
  }


   /* ************************************************
      This part of the code was just about changing the instance variables to private and recompiling Test1.java and Test2.java 
      to understand that you can only access the variables if they are public. 

      ************************************************ */

   /* ================================================
      This getValue method returns the element in the array index value that is equal to the variable outcome
      ================================================ */
   public String getValue() {

      return value[outcome]; //Based on the random number stored in the variable outcome, this returns the element equal with that index in value[]. 
}
   /* ================================================
       This getValue method returns the element in the array index color that is equal to the variable outcome
      ================================================ */
   public String getColor() {
      return color[outcome]; //Based on the random number stored in the variable outcome, this returns the element equal with that index in color[]. 
   }

   /* ================================================
      This toString method converts the Roulette object to a string and returns the value and color. 
      ================================================ */
   public String toString() {	
		return getValue() + " " + getColor(); //Calls the previous two methods and returns the string value and color of the spin of the roulette wheel
   }

}
