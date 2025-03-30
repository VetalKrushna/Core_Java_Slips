/*9. Write a menu driven program to perform the following operations on
multidimensional array ie matrices :
 Addition
 Multiplication
 Exit
*/

package First;

import java.util.Scanner;

public class Que9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row and column:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		int b[][]=new int [m][n];
		int c[][]=new int[m][n];
		
		int i,j,k;
		System.out.println("Enter First matrix:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter Second matrix:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		int ch;
		do 
		{
			System.out.println("1-Addition\n2-Multiplication\n3-Exit\nEnter Choice:");
		    ch=sc.nextInt();
			
			switch(ch) 
			{
			case 1:for(i=0;i<m;i++)
					{
						for(j=0;j<n;j++)
						{
							c[i][j]=a[i][j]+b[i][j];
						}
					}
					System.out.println("Addition ::\n");
					for(i=0;i<m;i++)
					{
						for(j=0;j<n;j++)
						{
							System.out.print(c[i][j]+" ");
						}
						System.out.println();
					}
					break;
			case 2:for(i=0;i<m;i++)
					{
						for(j=0;j<n;j++)
						{
							c[i][j]=0;
							for(k=0;k<n;k++)
							{
							  c[i][j]=c[i][j]+a[i][k]*b[k][j];
							}
						}
					}
					System.out.println("Multiplication::\n");
					for(i=0;i<m;i++)
					{
						for(j=0;j<n;j++)
						{
							System.out.print(c[i][j]+" ");
						}
						System.out.println();
					}
					break;
			}
		}while(ch<3);
	}	
}
