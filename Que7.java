/*7. Define a class patient (patient_name, patient_age,
patient_oxy_level,patient_HRCT_report). Create an object of patient. Handle
appropriate exception while patient oxygen level less than 95% and HRCT scan report
greater than 10, then throw user defined Exception “Patient is Covid Positive(+) and
Need to Hospitalized” otherwise display its information.
*/

package First;
import java.util.*;

class UserException extends Exception
{
	public UserException()
	{
		System.out.println("Patient is Covid Positive(+) and Need to Hospitalized");
	}
}
class patient
{
	String pname;
	int hrct,oxylevel,age;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Patient Name,Age,Oxygen level and HRCT repo:");
		pname=sc.next();
		age=sc.nextInt();
		oxylevel=sc.nextInt();
		hrct=sc.nextInt();
	}
	
}
public class Que7 
{
	public static void main(String[] args) 
	{
		patient p=new patient();
		p.accept();

		try
		{
			if(p.oxylevel < 95 && p.hrct > 10) 
			{
				throw new UserException();
			}
			else
			{
				System.out.println("Patien details:");
				System.out.println("Name:"+p.pname);
				System.out.println("Age:"+p.age);
				System.out.println("Oxygen Level:"+p.oxylevel);
				System.out.println("HRCT report:"+p.hrct);
			}
		}
		catch (Exception e)
		{}
	}
	
}
