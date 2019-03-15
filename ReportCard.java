package Containment;

public class ReportCard {
	String grade;
	private double percentage;

	public ReportCard() {

	}

	public ReportCard(double percentage) {
		this.percentage = percentage;
		setGrade();
	}

	void setGrade() {
		if (percentage > 85 && percentage <= 100) {
			grade = "first class";
		} else if (percentage > 75 && percentage < 85) {
			grade = "second class";
		} else if (percentage > 65 && percentage < 75) {
			grade = "third class";
		} else if (percentage > 55 && percentage < 65) {
			grade = "fourth class";
		} else if (percentage > 45 && percentage < 35) {
			grade = "fifth grade";
		} else {
			grade = "fail";
		}

	}

	public void printGrade() {
		System.out.println("grade is " + grade);
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
