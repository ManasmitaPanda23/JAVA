package Lambda;

public class TestPrinter {
	public static void main(String[] args) {
		Printable p = () -> System.out.println("instant print");
		p.print();
		Printable p1 = () -> System.out.println("start printing");
		p1.print();

	}

}
