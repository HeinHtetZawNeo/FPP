package day5.assignment3;

public class SavingAccount extends Account {
	public SavingAccount(double balance) {
		super(balance);
	}
	public String getAcctType() {
		return "SAVING";
	}
	public double getBalanceFromCustomer() {
		super.makeWithdrawal(0.1);
		return super.getBalance();
	}
}
