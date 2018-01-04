/* Name: Yibo Wang 
UserID: 2203982 
Section number:006 
I collaborated with Hiroo Aoyama.*/

public class Lab4 
{

	public static double bloitsToMiles(int bloits)
	{
		double miles= 1.3 * bloits;
		return miles;
	}

	public static void main(String[] args) 
	{
 
		System.out.println (bloitsToMiles(3));
		System.out.println (roll(6));
        }  
	//The point of this program is to convert bloits to miles. 

	public static int roll(int x) 
	{
 
		return (int)(x* Math.random()+1);
		

	//The point of this program is to generate numbers from 1-6. 

	}
}

