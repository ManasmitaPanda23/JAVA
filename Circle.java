package abstractclass;

public class Circle extends Shape {
	double radius;

	public Circle() {

	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void findArea() {
		area = 3.142 * radius * radius;

	}

	@Override
	public void printShape() {
		System.out.println("radius=" + radius);
		super.printShape();
	}

}
