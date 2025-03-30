/*21. Define a class MyNumber having one private int data member. Write a
default constructor to initialize it to 0 and another constructor to initialize it
to a value (Use this). Write methods isNegative, isPositive, isZero, isOdd,
isEven. Create an object in main. Use command line arguments to pass a
value to the object*/

package First;


class MyNumber
{
    int a;
    MyNumber()
    {
        a=0;
    }
    MyNumber(int a)
    {
        this.a=a;
    }
    
    void ispositive()
    {
        if(a>0) 
        	System.out.println("Number is Positive");
    }
    void isnegetive()
    {
        if(a<0) 
        	System.out.println("Number is Negative");
    }
    void iszero()
    {
        if(a==0) 
        	System.out.println("Number is Zero");
    }
    void iseven()
    {
        if(a%2==0) 
        	System.out.println("Number is Even");
    }
    void isodd()
    {
        if(a%2!=0) 
        	System.out.println("Number is Odd");
    }

}

   

public class Que21
{
	 public static void main(String args[])
	    {
	       
	        MyNumber ob1=new MyNumber();
	        MyNumber ob=new MyNumber(Integer.parseInt(args[0]));

	        ob.ispositive();
	        ob.isnegetive();
	        ob.iszero();
	        ob.iseven();
	        ob.isodd();
	        
	    }
}
