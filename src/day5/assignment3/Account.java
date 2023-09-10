package day5.assignment3;

public abstract class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;

	Account(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "balance = " + this.balance;
	}

	public void makeDeposit(double deposit) {
		// updates the balance field
		this.balance += deposit;
	}

	public void makeWithdraw(double withdraw) {
		// updates the balance field
		this.balance -= withdraw;
	}

	public boolean makeWithdrawal(double amount) {
		// updates the balance field and returns true, unless
		// withdrawal amount is too large; in that case,
		// it does not modify the balance field, and returns false
		if (this.balance < amount) {
			System.out.println("Insufficient Funds");
			return false;
		}
			
		makeWithdraw(amount);
		return true;
	}

	public double getBalanceFromCustomer() {
		return this.balance;
	}
	
	public double getBalance() {
		return this.balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double computeInterest() {
		return balance;
	}

	public abstract String getAcctType() ;
}
