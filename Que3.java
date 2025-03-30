/*3. Write a Program to print all odd numbers in an array of ‘n’
elements. (use command line arguments)*/
package First;

public class Que3 
{
	public static void main(String[] args) 
	{
		System.out.println("Odd numbers:");
		
		 for(int i=0;i<args.length;i++) 
		 {
			 int n=Integer.parseInt(args[i]);
			 if(n%2!=0)
				 System.out.print(" "+args[i]);
		 }
	}



}
