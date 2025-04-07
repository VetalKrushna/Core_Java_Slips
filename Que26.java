
package First;
/*26. Define class EmailId with members ,username and password. Define default
and parameterized constructors. Accept values from the command line Throw
user defined exceptions – “InvalidUsernameException” or
“InvalidPasswordException” if the username and password are invalid.
*/
import java.util.*;
class UserName extends Exception
{
    public UserName()
    {
    	System.out.println("InvalidUsernameException");
    }
}
class Password extends Exception
{
    public Password()
    {
    	System.out.println("InvalidPasswordException");
    }
}
class Emailid
{
   String name,password;
   Emailid()
   {
	   name="";
	   password="";
   }
   Emailid(String name,String password)
   {
	   this.name=name;
	   this.password=password;
   }
   
}
public class Que24
{
	public static void main(String[] args) 
	{
		String name, password;
         name=args[0];
         password=args[1];
         try
         {
        	if("Krushna".equals(name))
        		System.out.println("Valid UserName");
        	else
        		 throw new UserName();
         }
         catch(Exception e)
         {
        	 
         }
         try
         {
        	if("Pass@123".equals(password))
        		System.out.println("Valid password");
        	else
        		 throw new Password();
         }
         catch(Exception e)
         {
        	 
         }
	}
}