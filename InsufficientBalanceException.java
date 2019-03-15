package exception;

import java.io.PrintStream;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException() {

	}

	public InsufficientBalanceException(String errorMsg) {
		super(errorMsg);
	}

	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}

	public void printException() {
		System.out.println("the exception was caused by insufficient balance");
	}

}
