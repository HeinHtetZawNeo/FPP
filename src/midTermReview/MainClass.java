package midTermReview;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		/*List<BankAccount> arr1 = new ArrayList<BankAccount>();
		arr1.add(new SavingAccount(111, 100));

		arr1.add(new CheckingAccount(222, 200));
		((CheckingAccount)arr1.get(1)).setNumberOfChecksWritten(10);
		arr1.add(new CheckingAccount(333, 300));
		((CheckingAccount)arr1.get(2)).setNumberOfChecksWritten(20);

		// total Balance
		System.out.printf("Total Balance :%,.2f \n", totalBalance(arr1));
		// Print Checkdata
		System.out.printf("\n Print CheckingData \n");
		printCheckingData(arr1);
		// Print Checkdata with Polymorphic way
		System.out.printf("\n Print CheckingData With Polymorphic Way\n");
		printCheckingDataInPolyWay(arr1);
		// Print All Bank info
		System.out.printf("\n Print All BankAcc\n");
		printAllBankAccountsData(arr1);
		
		System.out.printf("Count for Hello World is %d",countString("Hello World"));*/
		
		for(int x=1; x<50; x++) {
			if(recursivePrime(x, 2)) {
				System.out.println(x);
			}
		}
	}
	
	public static int countString(String s) {
		int count=0;
		for(;count<s.length();count++) {}
		return count;
	}

	public static double totalBalance(List<BankAccount> bankAccList) {
		double totalBalance = 0.0;
		for (BankAccount b : bankAccList) {
			totalBalance += b.getBalance();
		}
		return totalBalance;
	}

	public static void printCheckingData(List<BankAccount> bankAccList) {
		System.out.printf("| AccNo | Balance | ChecksWritten |\n");
		for (BankAccount b : bankAccList) {
			if (b instanceof CheckingAccount) {
				System.out.printf("| %s | %,.2f | %d |\n", b.getAccountNumber(), b.getBalance(),
						((CheckingAccount) b).getNumberOfChecksWritten());
			}
		}
	}

	public static void printCheckingDataInPolyWay(List<BankAccount> bankAccList) {
		System.out.printf("| AccNo | Balance | ChecksWritten |\n");
		for (BankAccount b : bankAccList) {
			b.printNumberOfChecksWritten();
		}
	}

	public static void printAllBankAccountsData(List<BankAccount> bankAccList) {
		System.out.printf("| AccNo | Balance | ChecksWritten |\n");
		for (BankAccount b : bankAccList) {
			b.printAllBankInfo();
		}
	}

	
	public static boolean recursivePrime(int x, int i) {
		if (x <= 1)
			return false;
		else if (x == 2 || x == i) // base
			return true;
		if (x % i != 0) 
			return recursivePrime(x, ++i);
		else
			return false;
	}
}
