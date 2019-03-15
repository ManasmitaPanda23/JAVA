package Arrays;

public class Exam {
	private String examName;
	double totalmarks;
	double obtainedmarks;

	public Exam() {

	}

	public Exam(String examName, double totalmarks, double obtainedmarks) {
		this.examName = examName;
		this.totalmarks = totalmarks;
		this.obtainedmarks = obtainedmarks;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public double getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(double totalmarks) {
		this.totalmarks = totalmarks;
	}

	public double getObtainedmarks() {
		return obtainedmarks;
	}

	public void setObtainedmarks(double obtainedmarks) {
		this.obtainedmarks = obtainedmarks;
	}

	public void printExam() {
		System.out.println(" exam name=" + examName);
		System.out.println("total marks=" + totalmarks);
		System.out.println("obtained marks=" + obtainedmarks);
	}

}
