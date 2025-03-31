/*31. Define a Item class (item_number, item_name, item_price). Define a default and
parameterized constructor. Keep a count of objects created. Create objects using
parameterized constructor and display the object count after each object is
created.(Use static member and method). Also display the contents of each object.
*/

package First;

import java.util.Scanner;

class Item
{
	int ino,price;
	static int obcount=0;
	String iname;
	Item()
	{
		ino=0;
		iname=null;
		price=0;
	}
	Item(int ino,String iname,int price)
	{
		this.ino=ino;
		this.iname=iname;
		this.price=price;
	}
	
	static int count()
	{
		return ++obcount;
	}
	
	void display()
	{
		System.out.println("\nItem \nNo:"+ino+"\nName:"+iname+"\nPrice:"+price);
	}
}
public class Que31 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=sc.nextInt();
		Item []ob=new Item[n];
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Enter Item No Name and Price:");
			int ino=sc.nextInt();
			String iname=sc.next();
			int price=sc.nextInt();
			ob[i]=new Item(ino,iname,price);
			System.out.println("Object count="+Item.count());
		}
		
		for(int i=0;i<n;i++)
		{
			ob[i].display();
		}
	}
}
