/*12. Create a class Sphere, to calculate the volume and surface area of
sphere. (Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))*/

package First;
class Sphere
{
	void volume(double r)
	{
		double v=(4/3)*3.14*(r*r*r);
		System.out.println("Volume of Sphere:"+v);
	}
	void area(double r)
	{
		double a=4*3.14*(r*r);
		System.out.println("Surface Area of Sphere:"+a);
	}
}
public class Que12 
{
	public static void main(String[] args) 
	{
		Sphere s=new Sphere();
		s.volume(56.2);
		s.area(63.4);
	}
}
