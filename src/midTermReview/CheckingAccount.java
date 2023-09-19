package midTermReview;

public class CheckingAccount extends BankAccount{
	int numberOfChecksWritten;
	
	public CheckingAccount(long accountNumber,double balance) {
		super(accountNumber,balance);
	}
	
	public int getNumberOfChecksWritten() {
		return this.numberOfChecksWritten;
	}
	public void setNumberOfChecksWritten(int no) {
		this.numberOfChecksWritten = no;
	}

	@Override
	public void printAllBankInfo() {
		System.out.printf("| %s | %,.2f | %d |\n",super.getAccountNumber(),super.getBalance(),this.numberOfChecksWritten);
	}

	@Override
	public void printNumberOfChecksWritten() {
		System.out.printf("| %s | %,.2f | %d |\n",super.getAccountNumber(),super.getBalance(),this.numberOfChecksWritten);
	}
}
