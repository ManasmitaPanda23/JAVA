package overloading;

public class AreaFinder {
	int r;
	double PIE = 3.142;
	int a;
	double area;

	void areaCircle() {

		area = PIE * r * r;

		System.out.println("area=" + area);

	}

	void areaSquare() {

		area = a * a;

		System.out.println("area=" + area);
	}

}
