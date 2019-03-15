package Generics;

public class Report {
	public void printReportTillJava(Meeting<? super Java> m) {
		System.out.println("printing report till java only");
		m.printMeeting();

	}

	public void printReportAllTester(Meeting<? extends Tester> m) {
		System.out.println("printing reports for testers only");
		m.printMeeting();
	}

}