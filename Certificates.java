package containment2;

public class Certificates {
	private String Uniname;
	private String name;
	private String grade;

	public Certificates() {

	}

	public Certificates(String Uniname, String name, String grade) {
		this.Uniname = Uniname;
		this.name = name;
		this.grade = grade;
	}

	public String getUniname() {
		return Uniname;
	}

	public void setUniname(String uniname) {
		Uniname = uniname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void printCertificates() {
		System.out.println(Uniname + "," + name + "," + grade);
	}

	public void printAddress() {
		
	}
}