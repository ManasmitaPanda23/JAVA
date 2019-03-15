package Generics;

public class TestGeneric {
	public static void main(String[] args) {
		Meeting<Java> m1 = new Meeting<Java>(new Java());
		m1.printMeeting();
		Meeting<Tester> m2 = new Meeting<Tester>(new Tester());
		m2.printMeeting();
		Report r= new Report();
		r.printReportTillJava(m1);
		r.printReportAllTester(m2);
	}

}
