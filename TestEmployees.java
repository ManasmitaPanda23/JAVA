package containment2;

import java.util.Scanner;

public class TestEmployees {
	private static Scanner scn;

	public static void main(String[] args) {
		scn = new Scanner(System.in);
		Employee e = new Employee();
		Address a = new Address();
		Certificates c = new Certificates();
		System.out.println("enter id,name");
		e.setId(scn.nextInt());
		e.setName(scn.next());
		System.out.println("enter city,state,pincode");
		a.setCity(scn.next());
		a.setState(scn.next());
		a.setPincode(scn.next());
		System.out.println("enter address line");
		scn.nextLine();
		a.setLine(scn.next());
		System.out.println("enter uniname,name,grade");
		c.setUniname(scn.next());
		c.setName(scn.next());
		c.setGrade(scn.next());
         e.setA(a);
         e.setC(c);
		e.printEmployees();

	}

}
