package day5.assignment3;

public class RetirementAccount extends Account{
	public RetirementAccount(double balance) {
		super(balance);
	}
	public String getAcctType() {
		return "RETIREMENT";
	}
	public boolean makeWithdrawal(double balance) {
		return super.makeWithdrawal(balance+1);
	}
}
