package abstractclass;

public class TestShape {
	public static void main(String[] args) {
		Shape c = new Circle("circle", 5.45);
		Shape s = new Square("square", 2.2);
		Shape r = new Rectangle("Rectangle", 5.6, 7.8);
		c.findArea();
		c.printShape();
		s.findArea();
		s.printShape();
		r.findArea();
		r.printShape();
	}

}
