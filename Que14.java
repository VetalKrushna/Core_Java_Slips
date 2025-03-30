/*14. Write a program to create a class Product (product_id, product_name, product_cost,
product_quantity) default and parameterized constructor. Create objects of class product
and display the contents of each object and Also display the object count.
*/

package First;

import java.util.Scanner;

class Product 
{
	int id,cost,qty;
	static int obcount=0;
	String name;
	
	Product()
	{
		id=0;
		cost=0;
		qty=0;
		name=null;
	}
	Product(int id,int cost,int qty,String name)
	{
		this.id=id;
		this.cost=cost;
		this.qty=qty;
		this.name=name;
	}
	void display()
	{
		System.out.println("\nObject count:"+(++obcount));
		System.out.println("Id:"+id+"\nName:"+name+"\nCost:"+cost+"\nQuanity:"+qty);
	}
}
public class Que14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		
		Product p[]=new Product[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Product id name cost quantity:");
			int id=sc.nextInt();
			String name=sc.next();
			int cost=sc.nextInt();
			int qty=sc.nextInt();
			p[i]=new Product(id,cost,qty,name);
		}
		for(int i=0;i<n;i++)
		{
			p[i].display();
		}
	}
}

