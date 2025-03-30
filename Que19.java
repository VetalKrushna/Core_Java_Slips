/*19. Write a program to accept the array element and display in reverse order
 
 */

package First;
import java.util.*;
public class Que19 
{
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	  	System.out.println("Enter limit");
	  	int n=sc.nextInt();
	  	
	  	int a[]=new int[n];
	  	System.out.println("Enter Array:");
	  	for(int i=0;i<a.length;i++)
	  	{
	  		a[i]=sc.nextInt();
	  	}
	  	System.out.println("Array in Reverse order:");
	  	for(int i=a.length-1;i>=0;i--)
	  	{
	  		System.out.print(" "+a[i]);
	  	}
	}
}
