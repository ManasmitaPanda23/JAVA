package Lambda;

import java.util.function.Predicate;

public class TestPasswordChecker {
	public static void main(String[] args) {
		// normal method
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if (t.length() > 5)
					return true;
				return false;
			}

		};
		// using lambda
		Predicate<String> max = (t) -> {
			return (t.length() <= 10) ? true : false;
		};
		PasswordChecker p = new PasswordChecker();
		System.out.println("check if the string is min 5");
		p.check("iampassword", predicate);
		System.out.println("check if the string length is max 10");
		p.check("iampassword", max);
		System.out.println("check if the string is empty");
		p.check("", (t) -> {
			return (t.isEmpty()) ? true : false;
		});

	}

}
