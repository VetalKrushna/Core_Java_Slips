
/*6. Write a program to accept ‘n’ name of cities from the user and
sort them in ascending order*/

package First;

import java.util.Scanner;

public class Que6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		
		String sr[]=new String[n];
		System.out.println("Enter n Cities Name:");
		for(int i=0;i<sr.length;i++)
		{
			sr[i]=sc.next();
		}
		for(int i=0;i<sr.length;i++) 
		{
			for(int j=0;j<i;j++)
			{
				if(sr[i].compareTo(sr[j])<0)
				{
					String s=sr[i];
					sr[i]=sr[j];
					sr[j]=s;
				}
			}
		}
		System.out.println("Sorted Cities:");
		for(String s:sr)
		{
			System.out.println(s);
		}
		
	}

}
