package inheritance;

public class Vehicle {
	String name;
	String color;
	double speed;
	public String gearType;
	public String strokeType;

	public Vehicle() {

	}

	public Vehicle(String name, String color, double speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	public void print() {
		System.out.println("name=" + name);
		System.out.println("color=" + color);
		System.out.println("speed=" + speed);
	}

	public void accelerate() {
		System.out.println("speed increased");
	}

}
