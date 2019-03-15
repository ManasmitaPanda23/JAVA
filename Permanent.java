package inheritance;

public class Permanent extends Employee {
	double bonus;

	public Permanent() {

	}

	public Permanent(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;

	}

	@Override
	public void print() {
		super.print();
		System.out.println("the bonus of employee is" + bonus);
	}

	@Override
	public void calsalary() {
		super.calsalary();
		salary = salary + bonus;
		System.out.println("salary per month is" + salary);
	}

}
