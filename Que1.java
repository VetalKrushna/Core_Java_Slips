
/*1. Write a Program to print all Prime numbers in an array of ‘n’
elements. (use command line arguments).
*/
package VIsemSlips.src.First;
import java.util.*;
public class Que1 
{
	public static void main(String[] args) 
	{
		System.out.println("Prime numbers:");
		int j;
		 for(int i=0;i<args.length;i++) 
		 {
			 int n=Integer.parseInt(args[i]);
			 for(j=2;j<n;j++)
			 {
				 if(n%j==0)
					 break;
			 }
			 if(j==n)
				 System.out.print(" "+args[i]);
		 }
	}

}
