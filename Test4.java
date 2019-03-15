package Arrays;

import java.util.Scanner;

public class Test4 
{
	int id;
	String name;
	double Per;
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number of students");
		Student[] students=new Student[scn.nextInt()];
		for (int i = 0; i < students.length; i++) 
		{
			System.out.println("enter id,name and percentage for students"+(i+1));
			students[i]=new Student(scn.nextInt(),scn.next(),scn.nextDouble());
		}
		for (int i = 0; i < students.length; i++) 
		{
			System.out.println("=========displaying information for students======="+(i+1));
			students[i].print();
		}
		for(Student s:students) 
		{
			s.print();
	

}   }   }
