package day4.prog4_2;

import java.util.*;
import day4.prog4_1.AccountType;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private Date hireDate;
	
	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		this.hireDate = cal.getTime();
	}

	public void createNewChecking(double startAmount) {
		this.checkingAcct = new Account(AccountType.CHECKING, startAmount);
	}
	
	public void createNewSavings(double startAmount) {
		this.savingsAcct = new Account(AccountType.SAVINGS,startAmount);
	}
	
	public void createNewRetirement(double startAmount) {
		this.retirementAcct = new Account(AccountType.RETIREMENT,startAmount);
	}

	public void deposit(AccountType acctType, double amt){
		switch(acctType){
			case CHECKING:
				this.checkingAcct.makeDeposit(amt);
				break;
			case SAVINGS:
				this.savingsAcct.makeDeposit(amt);
				break;
			case RETIREMENT:
				this.retirementAcct.makeDeposit(amt);
				break;
		}
	}
	public boolean withdraw(AccountType acctType, double amt){
		switch(acctType){
		case CHECKING:
			return this.checkingAcct.makeWithdrawal(amt);
		case SAVINGS:
			return this.savingsAcct.makeWithdrawal(amt);
		case RETIREMENT:
			return this.retirementAcct.makeWithdrawal(amt);
		}
		return false;
	}

	/*
	 * ACCOUNT INFO FOR Jim Daley:

		Account type: checking
		Current bal:  10500.0
		Account type: savings
		Current bal:  1000.0
		Account type: retirement
		Current bal:  9300.0

	 */
	public String getFormattedAcctInfo() {
		String result;
		result = String.format("\nACCOUNT INFO FOR %s \n", this.name);
		if(this.checkingAcct != null) {
			result += String.format("Account type: %s \n Current bal: %s \n", AccountType.CHECKING,this.checkingAcct.getBalance());
		}
		if(this.savingsAcct != null) {	
			result += String.format("Account type: %s \n Current bal: %s \n", AccountType.SAVINGS,this.savingsAcct.getBalance());
		}
		if(this.retirementAcct != null) {
			result += String.format("Account type: %s \n Current bal: %s \n", AccountType.RETIREMENT,this.retirementAcct.getBalance());
		}
		return result;
	}

}
