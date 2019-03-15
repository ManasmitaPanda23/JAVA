package abstractclass;

public class Square extends Shape {
	double a;

	public Square() {

	}

	public Square(String name, double a) {
		super(name);
		this.a = a;
	}

	@Override
	public void findArea() {
		area = a * a;

	}

	@Override
	public void printShape() {
		System.out.println("a=" + a);
		super.printShape();
	}

}
