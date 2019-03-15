package Arrays;

public class StudentExams {
	private int id;
	private String name;
	private Exam[] e;
	private Report r;

	public StudentExams() {

	}

	public StudentExams(int id, String name, Exam[] e, Report r) {
		this.id = id;
		this.name = name;
		this.e = e;
		this.r = r;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Exam[] getE() {
		return e;
	}

	public void setE(Exam[] e) {
		this.e = e;
	}

	public Report getR() {
		return r;
	}

	public void setR(Report r) {
		this.r = r;
	}

	public void calper() {
		double totalmarks=0.0;
		double obtainedmarks=0.0;
		for(Exam em:e) {
			totalmarks+=em.getTotalmarks();
			obtainedmarks+=em.getObtainedmarks();
			
		}
		r.setPer(obtainedmarks/totalmarks*100.0);

		r.calgrade();
	}

	public void printStudent() {
		System.out.println("id=" + id);
		System.out.println("name=" + name);

		r.printReport();

		for (Exam ex : e) {
			ex.printExam();
			
		}
	}

}
