package day5.assignment3;

public class CheckingAccount extends Account{
	public CheckingAccount(double balance) {
		super(balance);
	}
	
	public String getAcctType() {
		return "CHECKING";
	}

	public double getBalanceFromCustomer() {
		super.makeWithdrawal(0.2);
		return super.getBalance();
	}
}
