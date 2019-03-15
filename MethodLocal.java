package innerClass;

public class MethodLocal {

	public class Inner {

		public void foo() {

			class FooInner {

			}
			FooInner fi = new FooInner();
		}

	}
}
