package TY;

import java.util.Scanner;

public class TYMarks 
{
	public int tmark,pmark;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter TY Theory and Practical Marks:");
		tmark=sc.nextInt();
		pmark=sc.nextInt();
	}
}
