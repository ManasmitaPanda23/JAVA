package innerClass;

public class TestOuter {

	public static void main(String[] args) {

		Outer.Inner inner = new Outer().new Inner();
		inner.i = 10;
		System.out.println("inner class");
	}
}
