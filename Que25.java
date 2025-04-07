/*25. Write a package for String operation which has two classes Con and Comp. Con
class has to concatenates two strings and comp class compares two strings. Also
display proper message on execution.
*/

package String;import java.util.*;
class Concat
{
	void con(String s1,String s2)
	{
		String c=s1.concat(s2);
		System.out.println("Concatnated String:"+c);
	}
}

class Compare
{
	void comp(String s1,String s2)
	{
		if(s1.compareTo(s2)==0)
		{
			System.out.println("String are equal..");
		}
	}
}
public class Que25
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two String:");;
		String s1=sc.next();
		String s2=sc.next();
		Concat c1=new Concat();
		c1.con(s1,s2);
		Compare c2=new Compare();
		c2.comp(s1,s2);
	}
	
}
