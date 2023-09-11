package day5.assignment3;

import java.util.*;
import day4.prog4_1.AccountType;

public class Employee {
	private List<Account> accounts; 
	private String name;
	private Date hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		GregorianCalendar cal = new GregorianCalendar(yearOfHire, monthOfHire - 1, dayOfHire);
		this.hireDate = cal.getTime();
		accounts = new ArrayList<Account>();
	}

	public String getName() {
		return this.name;
	}
	
	public void createAccount(Account acc) {
		this.accounts.add(acc);
	}
	
	public void deposit(String acctType, double amt) {
		for(Account ac:accounts) {
			if(ac.getAcctType().equals(acctType)) {
				ac.makeDeposit(amt);
			}
		}
	}

	public boolean withdraw(String accType, double amt) {
		
		for(Account ac:accounts) {
			if(ac.getAcctType().equals(accType)) {
				return ac.makeWithdrawal(amt);
			}
		}
		return false;
	}
	
	public List<Account> getAccounts() {
		return this.accounts;
	}
	public double getTotalBalance() {
		double total =0.0;
		for(Account ac:accounts) {
			total += ac.getBalance();
		}
		return total;
	}
	/*
	 * ACCOUNT INFO FOR Jim Daley:
	 * 
	 * Account type: checking Current bal: 10500.0 Account type: savings Current
	 * bal: 1000.0 Account type: retirement Current bal: 9300.0
	 * 
	 */
	public String getFormattedAcctInfo() {
		String result;
		result = String.format("\nACCOUNT INFO FOR %s \n", this.name);
		for(Account ac:accounts) {
			result += String.format("Account type: %s \n Current bal: %s \n", ac.getAcctType(),
					ac.getBalance());
		}
		
		return result;
	}

}
