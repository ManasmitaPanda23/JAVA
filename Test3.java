 package Assignment;

import java.util.Scanner;

public class Test3 
{
	public static void main(String[] args) 
	{
	 Scanner scn=new Scanner(System.in);
	 System.out.println("enter id");
	 int id=scn.nextInt();
	 System.out.println("enter name");
	 String name=scn.next();
	 System.out.println("enter marks");
		double marks=scn.nextDouble();
		Student e=new Student(id,name,marks);
		e.print();
	}

}
