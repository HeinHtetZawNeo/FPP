package midTermReview;

public class SavingAccount extends BankAccount{
	public SavingAccount(long accountNumber,double balance) {
		super(accountNumber,balance);
	}

	@Override
	public void printAllBankInfo() {
		System.out.printf("| %s | %,.2f |   |\n",super.getAccountNumber(),super.getBalance());
	}
}
