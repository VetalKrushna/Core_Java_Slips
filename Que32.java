/*32. Write a program to create a class
Customer(custno,custname,contactnumber,custaddr). Write a method to search
the customer name with given contact number and display the details.
*/

package First;
import java.util.*;
class Customer
{
	int cno;
	String cname,cntno,caddr;	
	Customer(int cno,String cname,String cntno,String caddr)
	{
		this.cno=cno;
		this.cname=cname;
		this.cntno=cntno;
		this.caddr=caddr;
		
	}
	
	void search(String contno)
	{
		if(cntno.equals(contno))
			{
				System.out.println("Customer Name:"+cname);
				System.out.println("Customer Number:"+cno);
				System.out.println("Customer Contact no"+cntno);
				System.out.println("Customer Address:"+caddr);			
			}
			else 
			{
				System.out.println("Customer not found..");
			}
	}
}
public class Que32
{
	public static void main(String[] args) 
	{
		
		Customer c=new Customer(1,"ABC","1234567890","India");
		c.search("1234567890");
		
		//c.search("9876543216");
		
	}
}
