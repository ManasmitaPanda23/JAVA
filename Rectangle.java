package abstractclass;

public class Rectangle extends Shape {
	double length;
	double breadth;

	public Rectangle() {

	}

	public Rectangle(String name, double length, double breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void findArea() {
		area = length * breadth;

	}

	@Override
	public void printShape() {
		System.out.println("area" + area);
		super.printShape();
	}

}
