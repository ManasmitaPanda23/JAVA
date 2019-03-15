package inheritance;

public class Consultant extends Employee {
	double incentive;
	int salperday;
	int days;

	public Consultant() {

	}

	public Consultant(String name, int id, double salary, double incentive, int salperday, int days) {
		super(name, id, salary);
		this.incentive = incentive;
		this.salperday = salperday;
		this.days = days;

	}

	@Override
	public void print() {
		super.print();
		System.out.println("the incentive is" + incentive);
		System.out.println("no of days="+days);
		System.out.println("salary per day="+salperday);
	}

	@Override
	public void calsalary() {
		super.calsalary();
		salary = (salperday * days) + incentive;
		System.out.println("the calculated salary is " + salary);
	}

}
