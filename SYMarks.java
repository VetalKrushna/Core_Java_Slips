package SY;

import java.util.Scanner;

public class SYMarks 
{
	public int cmark,mmark,emark;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter SY Marks:");
		System.out.println("Enter Computer Total:");
		cmark=sc.nextInt();
		System.out.println("Enter Math Total:");
		mmark=sc.nextInt();
		System.out.println("Enter Electronic Total:");
		emark=sc.nextInt();
	}
}
