
/*16. Write a program to find the square of given number using functional interface.*/
package First;
interface Square
{
	int calculate(int n);
}
public class Que16 
{
	public static void main(String[] args) 
	{
		Square s=(int n) -> n*n;
		
		int ans=s.calculate(10);
		System.out.println("Square:"+ans);
	}
}
