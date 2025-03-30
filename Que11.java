/*11. Create an abstract class “order” having members id, description. Create two subclasses
“PurchaseOrder” and “Sales Order” having members customer name and Vendor name
respectively. Definemethods accept and display in all cases. Create 3 objects each of
Purchase Order and Sales Order and accept and display details.*/

package First;

import java.util.Scanner;

abstract class order
{
	int id;
	String desc;
	abstract void accept();
	abstract void display();
}

class PurcheseOrder extends order
{
	Scanner sc=new Scanner(System.in);
	String cname;
	void accept()
	{
		System.out.println("Enter id description and name of customer:");
		 id=sc.nextInt();
		 desc=sc.next();
		 cname=sc.next();
	}
	void display()
	{
		System.out.println("Cusomer id:"+id);
		System.out.println("Customer Description:"+desc);
		System.out.println("Customer Name:"+cname);
	}
}

class SalesOrder extends order
{
	Scanner sc=new Scanner(System.in);
	String vname;
	void accept()
	{
		System.out.println("Enter id description and name of Vendor:");
		 id=sc.nextInt();
		 desc=sc.next();
		 vname=sc.next();
	}
	void display()
	{
		System.out.println("Vendor id:"+id);
		System.out.println("Vendor Description:"+desc);
		System.out.println("Vendor Name:"+vname);
	}
}
public class Que11
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1-Purchesorder\n2-SalesOrder\nEnter choice:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:PurcheseOrder p[]=new PurcheseOrder[3];
				for(int i=0;i<3;i++)
				{
					p[i]=new PurcheseOrder();
					p[i].accept();
				}
				for(int i=0;i<3;i++)
				{
					p[i].display();
				}
				break;
		case 2:SalesOrder s[]=new SalesOrder[3];
				for(int i=0;i<3;i++)
				{
					s[i]=new SalesOrder();
					s[i].accept();
				}
				for(int i=0;i<3;i++)
				{
					s[i].display();
				}
				break;
		}
		
	}

}
