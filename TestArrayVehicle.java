package inheritance;

import java.util.Scanner;

public class TestArrayVehicle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter no of vehicles");
		ArrayVehicle[] v = new ArrayVehicle[scn.nextInt()];
		for (int i = 0; i < v.length; i++) {
			System.out.println("enter details of vehicles");
			ArrayVehicle temp = new ArrayVehicle();
			ArrayCar c = new ArrayCar();
			ArrayBike b = new ArrayBike();
			System.out.println("enter 1 for car and 2 for bike");
			int n = scn.nextInt();
			switch (n) {
			case 1:
				if (n == 1) {
					System.out.println("it is a car");
					c.color = "red";
					c.name = "bmw";     
					c.speed = 20;
					c.gearType = "auto";
					c.accelerate();
					temp = c;

				}

				break;
			case 2:
				if (n == 2) {
					System.out.println("it is a bike");
					b.color = "black";
					b.name = "hero";
					b.speed = 30;
					b.strokeType = "2stroke";
					b.accelerate();
					temp = b;
				}

			default:
				break;
			}

			temp.print();
		}
	}

}
