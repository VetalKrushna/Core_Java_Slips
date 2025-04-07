/*20. Write a java program to display the system date and time in various formats shown below:
 Current date is : 31/08/2021
 Current date is :08-31-2021 
 Current date is : Tuesday August 31 2021
 Current date and time is : Fri August 31 15:25:59 IST 2021
 Current date and time is : 31/08/21 15:25:59 PM +0530
 Current time is : 15:25:59 
 Current week of year is : 35
 Current week of month : 5 
 Current day of the year is : 243
 Note: Use java.util.Date and java.text.SimpleDateFormat class 
 */
package Remaning;
import java.util.*;
import java.text.SimpleDateFormat;
public class Que24
{
	public static void main(String[] args) 
	{
	   Date d=new Date();
	   SimpleDateFormat sd=new SimpleDateFormat("dd/mm/yyyy");
	   String date=sd.format(d);
       System.out.println("Current date is:"+date);
       
       sd=new SimpleDateFormat("MM-dd-yyyy");
       date=sd.format(d);
       System.out.println("Current date is:"+date);
       
       sd=new SimpleDateFormat("EEE MMM-dd-yyyy");
       date=sd.format(d);
       System.out.println("Current date is:"+date);
       
       sd=new SimpleDateFormat("EEE MMM-dd-yyyy HH:mm:ss z");
       date=sd.format(d);
       System.out.println("Current date and time is:"+date);
       
       sd=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss z");
       date=sd.format(d);
       System.out.println("Current date and time is:"+date);
       
       sd=new SimpleDateFormat("HH:mm:ss");
       date=sd.format(d);
       System.out.println("Current time is:"+date);
       
       sd=new SimpleDateFormat("w");
       date=sd.format(d);
       System.out.println("Current week of year is:"+date);
       
       sd=new SimpleDateFormat("W");
       date=sd.format(d);
       System.out.println("Current week of month is:"+date);
       
       sd=new SimpleDateFormat("d");
       date=sd.format(d);
       System.out.println("Current day of the year is:"+date);
	}
}