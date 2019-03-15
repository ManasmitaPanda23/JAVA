package Containment;

import java.util.Scanner;

public class TestResult {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student s = new Student();

		System.out.println("enter id,name");
		s.setId(scn.nextInt());
		s.setName(scn.next());

		System.out.println("enter percentage");
		scn.nextLine();
		ReportCard r = new ReportCard(scn.nextDouble());
		s.setRpc(r);

		s.printStudent();

	}
}
