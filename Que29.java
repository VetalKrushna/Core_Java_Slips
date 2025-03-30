package First;
import java.util.*;
public class Que29 
{
	public static void main(String arg[])
	 {
			Scanner sc=new Scanner(System.in);
           int n,m;
           System.out.println("Enter no of row and colmn:");
           m=sc.nextInt();
           n=sc.nextInt();
           int a[][]=new int [m][n];
			System.out.println("Enter "+m+" X "+n+" matrix:");
               for(int i=0;i<m;i++)
               {
                   for(int j=0;j<n;j++)
                   {
                       a[i][j]=sc.nextInt();
                   }
               }
               int sum=0;
               for(int i=0;i<m;i++)
               {
                   for(int j=0;j<n;j++)
                   {
                	   if(i==j)
                        sum=sum+a[i][j];
                   }
                  
               } System.out.println("Sum of Diagonal element::"+sum);
	  }
}
