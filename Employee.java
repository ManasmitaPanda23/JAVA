package inheritance;

public class Employee {
	String name;
	int id;
	double salary;

	public Employee() {

	}

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void print() {
		System.out.println("name=" + name);
		System.out.println("id=" + id);
		System.out.println("salary=" + salary);
	}

	public void calsalary() {
		System.out.println("calculated salary is");
	}

}
