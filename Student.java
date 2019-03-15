package Containment;

public class Student {
	private int id;
	private String name;
	private ReportCard rpc;

	public Student() {
	}

	public Student(int id, String name,ReportCard rpc) {
		this.id = id;
		this.name = name;
		this.rpc=rpc;
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

	public ReportCard getRpc() {
		return rpc;
	}

	public void setRpc(ReportCard rpc) {
		this.rpc = rpc;
	}

	public void printStudent() {
		System.out.println("id is" + id);
		System.out.println("name is" + name);
		rpc.printGrade();
	}
}
