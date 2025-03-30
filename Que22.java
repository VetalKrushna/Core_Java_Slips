/*22. Create an employee class(id,name,deptname,salary). Define a default and
parameterized constructor. Use ‘this’ keyword to initialize instance variables.
Keep a count of objects created. Create objects using parameterized constructor
and display the object count after each object is created.(Use static member and
method). Also display the contents of each object.
*/

package First;

import java.util.Scanner;

class Employee
{
	int id,sal;
	String name,dept;
	static int obcount=0;
	
	Employee()
	{
		id=0;
		sal=0;
		name=null;
		dept=null;
	}
	Employee(int id,String name,String dept,int sal)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	
	static int count()
	{
		return ++obcount;
	}
	
	void display()
	{
		System.out.println("\nEmployee \nId:"+id+"\nName:"+name+"\ndepartment:"+dept+"\nSalary:"+sal);
	}
}
public class Que22 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=sc.nextInt();
		Employee []emp=new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Enter Employee Id Name Department And Salary:");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int sal=sc.nextInt();
			emp[i]=new Employee(id,name,dept,sal);
			System.out.println("Object count="+Employee.count());
		}
		
		for(int i=0;i<n;i++)
		{
			emp[i].display();
		}
	}
}

