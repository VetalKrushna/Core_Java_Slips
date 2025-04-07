package First;
import SY.*;
import TY.*;
import java.util.Scanner;

class student
{
	int rno,total;
	String name,Grade; 
	float per;
	Scanner sc=new Scanner(System.in);
	void accept()
	{
		System.out.println("Enter Roll no and Name:");
		rno=sc.nextInt();
		
		name=sc.next();
	}
	
}
public class Que24 
{
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Limit:");
		int n=sc.nextInt();
		student s[]=new student[n];
		TYMarks ty[]=new TYMarks[n];
		SYMarks sy[]=new SYMarks[n];
		
		for(int i=0;i<n;i++)
		{
			s[i]=new student();
			s[i].accept();
			
			ty[i]=new TYMarks();
			ty[i].accept();
			
			sy[i]=new SYMarks();
			sy[i].accept();
			
			s[i].total=s[i].total+ty[i].tmark+ty[i].pmark+sy[i].cmark;
			s[i].per=s[i].total/3;
		}
		
		System.out.println("\nRno\tName\tPerc\tGrade");
		System.out.println("-------------------------------");
		for(int i=0;i<n;i++)
		{
		 if(s[i].total>=70)
			 s[i].Grade="A";
		 else if(s[i].total>=60)
			 s[i].Grade="B";
		 else if(s[i].total>=50)
			 s[i].Grade="C";
		 else if(s[i].total>=40)
			 s[i].Grade="Pass";
		 else 
			 s[i].Grade="Fail";
		 System.out.println(s[i].rno+"\t"+s[i].name+"\t"+s[i].per+"\t"+s[i].Grade);
		}
			
	}
}
