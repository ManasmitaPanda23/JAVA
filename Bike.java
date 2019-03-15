package inheritance;

public class Bike extends Vehicle {
	String strokeType;

	public Bike() {

	}

	public Bike(String name, String color, double speed, String strokeType) {
		super(name, color, speed);
		this.strokeType = strokeType;
	}

	public void print() {
		super.print();
		System.out.println("strokeType=" + strokeType);
	}

	@Override
	public void accelerate() {
		super.accelerate();
		speed += 5;
		System.out.println("speed increased by 5km/hr=" + speed);
	}

}
