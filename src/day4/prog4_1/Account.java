package day4.prog4_1;

public class Account {
	private AccountType accountType;
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private Employee employee;

	Account(Employee emp, AccountType acctType, double balance) {
		this.employee = emp;
		this.accountType = acctType;
		this.balance = balance;
	}

	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + this.accountType + ", balance = " + this.balance;
	}

	public void makeDeposit(double deposit) {
		// updates the balance field
		this.balance -= deposit;
	}

	public boolean makeWithdrawal(double amount) {
		// updates the balance field and returns true, unless
		// withdrawal amount is too large; in that case,
		// it does not modify the balance field, and returns false
		if (this.balance < amount)
			return false;

		makeDeposit(amount);
		return true;
	}

	public double getBalance() {
		return this.balance;
	}

	public AccountType getAcctType() {
		return this.accountType;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccType(AccountType accType) {
		this.accountType = accType;
	}

	public double computeInterest() {
		if (this.accountType.equals(accountType.CHECKING))
			return this.balance * 0.02;
		if (this.accountType.equals(accountType.SAVINGS))
			return this.balance * 0.04;
		if (this.accountType.equals(accountType.RETIREMENT))
			return this.balance * 0.05;
		return 0;
	}

}
