package exception;

public class Transaction {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void deposit(double amount) throws NegativeAmountException {
		if (amount < 0)
			throw new NegativeAmountException("Negative amount encountered");
		balance += amount;
		System.out.println("Balance= " + balance);

	}

	void withdraw(double amount) throws InsufficientBalanceException {
		if (balance - amount < 1000)
			throw new InsufficientBalanceException("insufficient balance found");
		balance -= amount;
		System.out.println("Balance=" + balance);
	}
}
