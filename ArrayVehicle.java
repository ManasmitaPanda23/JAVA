package inheritance;

public class ArrayVehicle {
	String name;
	String color;
	double speed;
	
	public ArrayVehicle() {

	}

	public ArrayVehicle(String name, String color, double speed) {
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
