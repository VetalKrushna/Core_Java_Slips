/*17. Define Student class(roll_no, name, percentage) to create n objects of
the Student class. Accept details from the user for each object. Define a
static method “sortStudent” which sorts the array on the basis of
percentage.
*/

package First;

import java.util.*;
class Student
{
	Scanner sc=new Scanner(System.in);
	int rno,per;
	String name;
	Student()
	{
		System.out.println("Enter Student roll no Name and Percentage:");
		rno=sc.nextInt();
		name=sc.next();
		per=sc.nextInt();
	}
	
	void display()
	{
		System.out.println("\nStudent \nRollno:"+rno+"\nName:"+name+"\nPercentage:"+per);
	}
	static void sortstudent(Student ob[],int n)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<i;j++)
			{
				if(ob[i].per > ob[j].per)
				{
					Student s=ob[i];
					ob[i]=ob[j];
					ob[j]=s;
				}
			}
		}
	}
	
}
public class Que17 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		Student s[]=new Student[n];
		for(int i=0;i<n;i++)
		{
		 s[i]=new Student();
		}
	  Student.sortstudent(s,n);
		System.out.println("Sorted Student:");
		for(int i=0;i<n;i++)
		{
			s[i].display();
		}
		
		
	}
}
