/*18. Write a menu driven program to perform the following operations
a. Calculate the volume of cylinder. (hint : Volume: π × r² × h)
b. Find the factorial of given number.
c. Check the number is Armstrong or not.
d. Exit
*/

package First;
import java.util.Scanner;
public class Que18 
{
	    public static void main(String[] args) 
	    {
	        Scanner sc=new Scanner(System.in);
	        int ch;
	        do{
	            System.out.println("1-Volume of cylinder\n2-Factorial of number\n3-Armstrong or not\n4-Exit\nEnter choice::");
	           ch=sc.nextInt();
	            switch(ch)
	            {
	                case 1:System.out.println("Enter radius and height:");
	                        float r=sc.nextFloat();
	                        float h=sc.nextFloat();
	                        System.err.println("Volume of cylinde:"+3.14*r*r*h);
	                        break;
	                case 2:System.err.println("Enter number:");
	                        int n=sc.nextInt();
	                        int f=1;
	                        for(int i=1;i<=n;i++)
	                            f=f*i;
	                           
	                        System.out.println("Factorial of number:"+f);   
	                        break;
	                case 3:System.err.println("Enter number:");
	                        int num=sc.nextInt();
	                        int s=0,d=0,k=num;
	                        while(num>0)
	                        {
	                            d=num%10;
	                            s=s+(d*d*d);
	                            num=num/10;
	                        }
	                        if(k==s)
	                         System.out.println("Number is Armostrong:");
	                        else
	                        System.out.println("Number is Not Armostrong:");
	            }
	        }while(ch!=4);
	    }
	    
}
