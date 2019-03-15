package containment2;

public class Employee {
	private int id;
	private String name;
	private Address a;
	private Certificates c;

	public Employee() {

	}

	public Employee(int id, String name,Address a, Certificates c) {
		this.id = id;
		this.name = name;
		this.a=a;
		this.c = c;
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

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public Certificates getC() {
		return c;
	}

	public void setC(Certificates c) {
		this.c = c;
	}

	public void printEmployees() {
		System.out.println("id =" + id);
		System.out.println("name =" + name);
		c.printCertificates();
		c.printAddress();
	}


}
