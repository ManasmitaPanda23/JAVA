package inheritance;

public class TestVehicle {
	public static void main(String[] args) {
		Car c = new Car();
		Bike b = new Bike();
		c.name = "city";
		c.color = "black";
		c.speed = 20;
		c.gearType = "auto";
		b.name = "hero";
		b.color = "red";
		b.speed = 30;
		b.strokeType = "2stroke";
		c.print();
		c.accelerate();
		b.print();
		b.accelerate();

	}

}
