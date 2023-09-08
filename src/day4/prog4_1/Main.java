package day4.prog4_1;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("Mr. A", "A", 20000, 2023, 9, 1);
		Account employeeSavingAcc = new Account(employee, AccountType.SAVINGS,300);
		Account employeeRetirementAcc = new Account(employee,AccountType.RETIREMENT,300);
		
		System.out.println(employeeSavingAcc);
		System.out.println(employeeRetirementAcc);
		
	}

}
