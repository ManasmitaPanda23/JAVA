package inheritance;

public class TestEmployee {
	public static void main(String[] args) {
		Permanent p = new Permanent();
		p.name = "khushi";
		p.id = 12;
		p.salary = 100000;
		p.bonus = 5000;
		p.print();
		p.calsalary();
		Consultant c = new Consultant();
		c.name = "abhi";
		c.id = 13;
		c.incentive = 10000;
		c.salperday = 2000;
		c.days = 51;
		c.print();
		c.calsalary();

	}

}
