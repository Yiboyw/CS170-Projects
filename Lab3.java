/* Name: Yibo Wang 
UserID: 2203982 
Section number:006 
I collaborated with Jason Kang and Dilsher Patel.*/

import java.util.Scanner;

public class Lab3
{ 

    public static void main(String[] args)
	{
		escape ();
		convert();
	}
	public static void escape () { 
		System.out.println("I said \"Hello\" to James.");
		System.out.print("The string \"\" is an empty string.\n");
		System.out.print("Shaq is 7'\" tall.\n");
		System.out.print("Comments can begin with // but not \\\\.\n");
}		
//The point of this program is to use the escape characters to create print sentences. 

	 
}

	public static void convert ()
	{

		Scanner distance = new Scanner (System.in);

		System.out.println("Please enter the number of miles you want to convert: "); 

		double mile = distance.nextdouble(); 
		double kilometer = 1.61 * mile;
	
		System.out.println(mile+" miles is "+kilometer+" kilometers.");		
	}
//The point of this program is to convert the number of miles a person types into the program into kilometers by using the convert method. 

	}	        

}
