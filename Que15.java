/*15. Write a program to find the cube of given number using functional interface*/


package First;

//Define a functional interface
@FunctionalInterface

interface Cube 
{
 int calculate(int x);
}


public class Que15 
{
	
	public static void main(String args[]) 
	{
	     int a = 2;

	     // lambda expression to 
	     // define the calculate method
	    Cube c = (int x) -> x * x * x;

	     // parameter passed and return type must be
	     // same as defined in the prototype
	     int ans = c.calculate(a);
	     System.out.println("Cube:"+ans);
	}    
}
