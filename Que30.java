/*30. Write a package for Operation, which has two classes, Addition and Maximum.
Addition has two methods add () and subtract (), which are used to add two integers
and subtract two, float values respectively. Maximum has a method max () to
display the maximum of two integers.
*/

package Operation;
import java.util.*;
class Addition
{
	void add(float a,float b)
	{
		System.out.println("Addition::"+(a+b));
	}
	void subtract(float a,float b)
	{
		System.out.println("\nSubstraction::"+(a-b));
	}
}

class Maximum
{
	void max(float a,float b)
	{
		if(a>b)
			System.out.println(a+"::number is Maximum..");
		else
			System.out.println(b+"::number is Maximum..");
	}
}
public class Que30 
{
	public static void main(String[] args) 
	{
		Addition ob=new Addition();
		ob.add(45.2f,12.3f);
		ob.subtract(32.2f,54.32f);
		
		System.out.println();
		Maximum ob1=new Maximum();
		ob1.max(65.2f,65.1f);
	}
}
