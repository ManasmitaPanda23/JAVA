package innerClass;

public class TestFoo {
	public static void main(String[] args) {

		Foo f = new Food();

		Foo f1 = new Foo() {
			@Override
			public void print() {
				System.out.println("Implementing");
			}
		};
		f1.print();
	}
}
