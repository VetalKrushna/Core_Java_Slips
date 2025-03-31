/*27. Write a program to create parent class College(cno, cname,
caddr) and derived class Department(dno, dname) from College.
Write a necessary methods to display College details
*/

package First;
import java.util.*;

class College
{
	Scanner sc=new Scanner(System.in);
	int cno;
	String cname,caddr;
	College()
	{
		System.out.println("Enter College No and Name and Address:");
		cno=sc.nextInt();
		cname=sc.next();
		caddr=sc.next();
	}
}
class Department extends College
{
	int dno;
	String dname;
	 Department() 
	 {
		 System.out.println("Enter Department No and Name:");
		 dno=sc.nextInt();
		 dname=sc.next();
	 }
	 void display()
	 {
		 System.out.println("\nCollege no:"+cno);
		 System.out.println("College Name:"+cname);
		 System.out.println("College Address:"+caddr);
		 System.out.println("Department No:"+dno);
		 System.out.println("Department Name:"+dname);
	 }
}
public class Que27
{
	public static void main(String[] args) 
	{
		Department ob=new Department();
		ob.display();
	}
}
