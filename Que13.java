/*13. Write a program to calculate perimeter and area of rectangle.
(hint : area = length * breadth , perimeter=2*(length+breadth))
*/


package First;
import java.util.*;

class Rectangle 
{

	
	double length;
	double width;


	void Area()
	{
		double area=this.length * this.width;
		System.out.println("Area of rectangle is : "+ area);
	}

	
	void Perimeter()
	{
		double perimeter= 2 * (this.length + this.width);
		System.out.println("Perimeter of rectangle is : "+ perimeter);
	
	}

}

public class Que13 
{
	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle();
		
		rect.length = 15.854;
		rect.width = 22.65;
	
		rect.Area();
		rect.Perimeter();
	}
}
