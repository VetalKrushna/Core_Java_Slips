/*28. Design a Super class Customer (name, phone-number). Derive a
class Depositor(accno , balance) from Customer. Again, derive a
class Borrower (loan-no, loan-amt) from Depositor. Write
necessary member functions to read and display the details of
‘n’customers.
*/

package First;
import java.util.*;
class Customer //Super class
{
   Scanner sc=new Scanner(System.in);
   String name,phno;
   void acceptC()
   {
	   System.out.println("Enter Customer Name And Phone No:");
	   name=sc.next();
	   phno=sc.next();
   }
}

class Depositer extends Customer
{
	int acno , bal;
	 void acceptD()
	{
		System.out.println("Enter Account no and Balance");
		acno=sc.nextInt();
		bal=sc.nextInt();
	}
}
class Borrower extends Depositer
{
	int lno,lamt;
	 void acceptB()
	{
		System.out.println("Enter Loan no and Loan Amount:");
		lno=sc.nextInt();
		lamt=sc.nextInt();
	}
	void display()
	{
		System.out.println("Details::");
		System.out.println("Customer Name:"+name);
		System.out.println("Phone Number:"+phno);
		System.out.println("Account no:"+acno);
		System.out.println("Balance:"+bal);
		System.out.println("Loan no:"+lno);
		System.out.println("Loan Amount:"+lamt);
	}
	
}
public class Que28
{

	public static void main(String[] args) 
	{
		Borrower b=new Borrower();
		b.acceptC();
		b.acceptD();
		b.acceptB();
		b.display();
	}
}
