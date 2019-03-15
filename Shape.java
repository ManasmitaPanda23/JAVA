package abstractclass;

public abstract class Shape {
	String name;
	double area;

	public Shape() {

	}

	public Shape(String name) {
		this.name = name;
	}
	

	public abstract void findArea();

	public void printShape() {
		System.out.println("name=" + name);
		System.out.println("area=" + area);
	}

}
