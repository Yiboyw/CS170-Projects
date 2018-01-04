/*Name: Yibo Wang
Emory ID: ywan738
Studennt ID # 2203982
Collaboration Statement: I used the Java textbook & collaborated with the TA Matt and Kevin Park. 
*/


import java.math.BigInteger;

public class Lab11 {
	public static BigInteger factorial(int n) {
		BigInteger bigResult = new BigInteger("1");
		//This declares the bigInteger and makes it equal to one. 
				
		for(int i = 1; i <= n; i++) {
				
		BigInteger number = new BigInteger(i + ""); //This takes the integer number and changes it into a Big Integer
		
		bigResult = bigResult.multiply(number); //This multiplies the bigresult to create the final factorial. 
		
		}
		
		return bigResult; 
	}

	
	public static void main(String[] args) {
	for(int i = 1; i <=31; i++) {
	System.out.println(i + "\t" + factorial(i));
	//Prints out the series of factorials.
	}
	
	}


}








