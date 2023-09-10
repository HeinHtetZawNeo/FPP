package day5.assignment3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Employee> emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		
		emps = new ArrayList<Employee>();
		
		emps.add(new Employee("Jim Daley", 2000, 9, 4));
		emps.add(new Employee("Bob Reuben", 1998, 1, 5));
		emps.add(new Employee("Susan Randolph", 1997, 2, 13));
		
		emps.get(0).createAccount(new CheckingAccount(10500));
		emps.get(0).createAccount(new SavingAccount(1000));
		emps.get(0).createAccount(new RetirementAccount(9300));
		
		emps.get(1).createAccount(new CheckingAccount(34000));
		emps.get(1).createAccount(new SavingAccount(27000));
		
		emps.get(2).createAccount(new CheckingAccount(10038));
		emps.get(2).createAccount(new SavingAccount(12600));
		emps.get(2).createAccount(new RetirementAccount(9000));
		computeAllBalance();
		//for phase I – console output
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A. See a report of all accounts.\n"
				+ "B. Make a deposit.\n"
				+ "C. Make a withdrawal.\n"
				+ "Make a selection (A/B/C):\n");
		String answer = sc.next();
		
		switch (answer) {
		case "A":
		case "a":
			String info = getFormattedAccountInfo();
			// display info to console
			System.out.print(info);
			break;
		case "B":
		case "b":
			makeDeposit(emps);
			break;
		case "C":
		case "c":
			makeWithdrawal(emps);
			break;
		default:
			System.out.println("Your input is not valid");
		}
		computeAllBalance();
	}

	
	private void makeWithdrawal(ArrayList<Employee> empList) {
		
		//chosose empt
		Employee emp = chooseEmployee(empList);
		if(emp==null) { 
			System.out.println("Your input is invalid");
			return;
		}

		//choose account
		Account acc =chooseAccount(emp);
		if(acc==null) { 
			System.out.println("Your input is invalid");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		double amt = 0;
		
		//get deposit amount
		System.out.print("Deposit amount: ");
		try {
			amt = Double.parseDouble(sc.nextLine());
		}catch (NumberFormatException e) {
			System.out.println("Your input is invalid");
			return;
		}
		
		if(acc.makeWithdrawal(amt)) {
			System.out.printf("$%.2f has been withdrawn from the \n"
					+ "%s of %s\n",amt,acc.getAcctType(),emp.getName());
		}else {
			System.out.printf("$%.2f has NOT been withdrawn from the \n"
					+ "%s of %s\n",amt,acc.getAcctType(),emp.getName());
		}
		
		
	}
	
	private void makeDeposit(ArrayList<Employee> empList) {
		
		//chosose empt
		Employee emp = chooseEmployee(empList);
		if(emp==null) { 
			System.out.println("Your input is invalid");
			return;
		}

		//choose account
		Account acc =chooseAccount(emp);
		if(acc==null) { 
			System.out.println("Your input is invalid");
			return;
		}
		
		Scanner sc = new Scanner(System.in);
		double amt = 0;
		
		//get deposit amount
		System.out.print("Deposit amount: ");
		try {
			amt = Double.parseDouble(sc.nextLine());
		}catch (NumberFormatException e) {
			return;
		}
		
		acc.makeDeposit(amt);
		System.out.printf("$%.2f has been deposited in the \n"
				+ "%s of %s\n",amt,acc.getAcctType(),emp.getName());
	}
	
	
	private Employee chooseEmployee(ArrayList<Employee> emp) {
		Scanner sc = new Scanner(System.in);
		int number=0;
		
		for(int i=0;i<emp.size();i++) {
			System.out.printf("%d. %s\n",i,emp.get(i).getName());	
		}
		System.out.println("an employee: (type a number) ");
		String choice = sc.nextLine();
		try {
			number = Integer.parseInt(choice);
			
		}catch (NumberFormatException e) {
			//System.out.println("Your input is invalid");
			return null;
		}
		if(number>emp.size()-1) return null;
		
		
		return emp.get(number);
	}
	
	
	private Account chooseAccount(Employee emp) {
		Scanner sc = new Scanner(System.in);
		int number=0;
		ArrayList<Account> accList =emp.getAccounts(); 
		int i=0;
		for(Account ac:accList) {
			System.out.printf("%d. %s\n",i,ac.getAcctType());
			i++;
		}
		
		
		System.out.println("Select an account: (type a number) ");
		String choice = sc.nextLine();
		try {
			number = Integer.parseInt(choice);
			
		}catch (NumberFormatException e) {
			return null;
		}
		if(number>accList.size()-1) return null;
		return emp.getAccounts().get(number);
	}
	
	
	private String getFormattedAccountInfo() {
		String temp = "";
		for (Employee emp : emps) {
			temp += emp.getFormattedAcctInfo();
		}
		
		return temp;
	}
	
	
	private void computeAllBalance() {
		if(emps==null) return;
		double totalCount =0;
		for(Employee e:emps) {
			for(Account a:e.getAccounts()) {
				totalCount += a.getBalance();
			}
		}
		System.out.printf("All the balances in the bank: $%.2f \n",totalCount);
	}
}