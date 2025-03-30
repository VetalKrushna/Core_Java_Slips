/*Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns,
bat_avg). Create an array of n player objects .Calculate the batting average for each
player using static method avg(). Define a static sort method which sorts the array on
the basis of average. Display the player details in sorted order.
*/

package First;

import java.util.*;
class Cricket
{
	 String name;
	 int inning, tofnotout, totalruns;
	 float batavg;
	 
	 public void accept() 
	 {
	  Scanner sc=new Scanner((System.in));
	  System.out.println("Enter the name, no of innings, no of times not out, total runs: ");
	  name=sc.next();
	  inning=sc.nextInt();
	  tofnotout=sc.nextInt();
	  totalruns=sc.nextInt();
	 }
	 
	 public void display()
	 {
	  System.out.println("Name="+name);
	  System.out.println("no of innings="+inning);
	  System.out.println("no times notout="+tofnotout);
	  System.out.println("total runs="+totalruns);
	  System.out.println("bat avg="+batavg); 
	 }
	 
	 static void avg(int n, Cricket c[])
	 {
	   for(int i=0;i<n;i++)
	   {
	     c[i].batavg=c[i].totalruns/c[i].inning;
	   }
	  }
	 
	 static void sort(int n, Cricket c[])
	 {
		  for(int i=0;i<n;i++)
		  {
		   for(int j=i+1;j<n;j++)
		   {
		    if(c[i].batavg<c[j].batavg)
		    {
		     Cricket t=c[i];
		     c[i]=c[j];
		     c[j]=t;
		    }
		   }
		  }
	  }
}

public class Que5 
{

 public static void main(String args[])
 {
 Scanner sc=new Scanner((System.in));
  System.out.println("Enter the limit:");
  int n=sc.nextInt();
  Cricket c[]=new Cricket[n];
  
  for(int i=0;i<n;i++)
  {
   c[i]=new Cricket();
   c[i].accept();
  }
  
  Cricket.avg(n,c);
  Cricket.sort(n,c);
  
  for(int i=0;i<n;i++)
  {
   c[i].display();
  }
 }
}
