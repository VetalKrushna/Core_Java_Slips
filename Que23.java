/*23. Write a java program to accept 5 numbers using command line
arguments sort and display them.
*/
package First;

public class Que23 
{
	public static void main(String[] args) 
	{
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		
		System.out.println("Comand line Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[i] < a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("\nSorted Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}
