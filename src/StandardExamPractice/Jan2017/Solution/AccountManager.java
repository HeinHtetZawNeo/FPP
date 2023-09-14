package StandardExamPractice.Jan2017.Solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		double total = 0.0;
		
		for(Employee e:emps) {
			List<Account> acList =  e.getAccounts();
			for(Account ac:acList) {
				total += ac.getBalance();
			}
		}
		return total;
	}
}
