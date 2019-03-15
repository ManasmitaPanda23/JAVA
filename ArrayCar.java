package inheritance;

public class ArrayCar extends ArrayVehicle {

	String gearType;

	public ArrayCar() {

	}

	public ArrayCar(String name, String color, double speed, String gearType) {
		super(name, color, speed);
		this.gearType = gearType;

	}

	public void print() {
		super.print();
		System.out.println("gearType=" + gearType);
	}

	public void accelerate() {
		speed += 5;
		System.out.println("speed increased by 5km/hr=" + speed);
	}

}