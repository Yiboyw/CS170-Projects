//Name: Yibo Wang
//EmoryID: ywan738
//Section Number: 006
//Collaboration Statement: I used on the Think @ Java course textbook. 


public class lab6 {

public static void main(String args[]) {
	
	power(2, 20);
	System.out.println(power(2,20));

	sumDigits(12);
	System.out.println(sumDigits(12));

}

	public static int power(int a, int n) {

	if (n == 0) {
	return 1;
	//This is the base solution so if the power of a number is zero, the solution is 0. 
	} 
	
	else {
	int powerbase = power(a, n-1);
	int result = a*powerbase;
	
	return result; 
	//This creates a recursive function in which each time the variable x increases by 1, the function will multiply by itself. 
	
	}
	}

	public static int sumDigits(int x) {
	if (x == 0) {
	return 0; 
	//This is just the base case. So if x is zero you get zero. 
	}
		
	else {
		int sum  = sumDigits(x/10); //First you create a smaller version of the sum method.
		int sum1 = x%10; //This is the sum of the final digit.
		int nextSum = sum + sum1; 
		return nextSum;
		
		
			//This creates a recursive function that adds the digits of the number entered together. 
		}

	}

}

