/*4. Define an abstract class Staff with protected members id and name. Define a
parameterized constructor. Define one subclass OfficeStaff with member department.
Create n objects of OfficeStaff and display all details.*/

package First;

import java.util.Scanner;

abstract class Staff
{
	protected int id;
	protected String name;
}

class OfficeStaff extends Staff
{
	String dept;
	OfficeStaff(int id,String name,String dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Department:"+dept);
		
	}
}
public class Que4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		OfficeStaff ob[]=new OfficeStaff[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Id Name and Department:");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			
			ob[i]=new OfficeStaff(id,name,dept);
		}
		for(int i=0;i<n;i++)
		{
			ob[i].display();
		}
	}
}
