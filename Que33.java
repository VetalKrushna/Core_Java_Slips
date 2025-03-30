/*33. Write program to define class Person with data member as
Personname,Aadharno, Panno. Accept information for 5 objects
and display appropriate information (use this keyword).
*/

package First;
import java.util.Scanner;
class Person
{
	
	String pname,ano,pno;
	Person(String pname,String ano,String pno) 
	{
		this.pname=pname;
		this.ano=ano;
		this.pno=pno;
	}
	
	void display()
	{
		System.out.println("\nPerson Name:"+pname+"\nAdharno:"+ano+"\nPan no:"+pno);
	}
}
public class Que33 
{
	
	public static void main(String[] args) 
	{
		
     Person ob[] = new Person[5];
	ob[0]=new Person("ABC","654657894121","AGW54865");
	ob[1]=new Person("XYZ","547657894665","A1234H4T");
	ob[2]=new Person("PQR","654657894121","DF548456");
	ob[3]=new Person("MNO","785417894114","ER548243");
	ob[4]=new Person("TUV","458745632171","JY513115");
	for(int i=0;i<5;i++)
	{
		ob[i].display();
	}
    }
}
