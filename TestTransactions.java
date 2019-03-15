package exception;

public class TestTransactions {
	public static void main(String[] args) {

		Transaction t = new Transaction();
		t.setBalance(10000.45);

		try {
			t.deposit(1000);
			t.withdraw(11000);
		} catch (NegativeAmountException e) {
			e.printStackTrace();
			e.printException();
		} catch (InsufficientBalanceException i) {
			i.printStackTrace();
			i.printException();
		}
	}

}
