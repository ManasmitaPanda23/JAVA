package Arrays;

public class Report {
	private String grade;
	private double per;

	public void Report() {

	}

	public void Report(String grade, double per) {
		this.grade = grade;
		this.per = per;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public void calgrade() {
		if (per >= 85 && per <= 100) {
			grade = "first class";
		} else if (per >= 75 && per < 85) {
			grade = " second class";
		} else if (per >= 65 && per < 75) {
			grade = " third class";

		} else if (per >= 55 && per < 65) {
			grade = "fourth grade";
		} else if (per >= 45 && per < 55) {
			grade = "fifth class";
		} else {
			grade = "fail";
		}

	}

	public void printReport() {
		System.out.println("the grade is" + grade);
		System.out.println("the percentage is" + per);
	}

}
