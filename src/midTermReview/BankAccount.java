package midTermReview;

public abstract class BankAccount {
	private double balance;
	private long accountNumber;
	
	public BankAccount(long accNo, double balance) {
		this.accountNumber = accNo;
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public long getAccountNumber() {
		return this.accountNumber;
	}
	public void printNumberOfChecksWritten() {}
	public abstract void printAllBankInfo();
}
