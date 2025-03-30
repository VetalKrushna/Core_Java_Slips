package First;

/*8. Write a program for multilevel inheritance such that Country is inherited from Continent.
State is inherited from Country. Display the place, State, Country and Continent.*/

import java.util.*;
	
class Continent 
{
	Scanner sc=new Scanner(System.in);
	String cnname;
	Continent()
	{
		System.out.println("Enter Continent name:");
		cnname=sc.next();
	}
}
class Country extends Continent
{
	String cname,sname,place;
	Country()
	{
		System.out.println("Enter Country Name:");
		cname=sc.next();
	}
}

class State extends Country
{
	String sname,place;
	State()
	{
		System.out.println("Enter State and Place name:");
		sname=sc.next();
		place=sc.next();
	}
	void display()
	{
		System.out.println("Continent::"+cnname);
		System.out.println("Country ::"+cname);
		System.out.println("State ::"+sname);
		System.out.println("Place ::"+place);
	}
}	


public class Que8 
{

	public static void main(String[] args) 
	{
			 
			State s=new State();
			s.display();
	}
}


