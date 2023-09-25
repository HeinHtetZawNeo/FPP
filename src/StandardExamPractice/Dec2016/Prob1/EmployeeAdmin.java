package StandardExamPractice.Dec2016.Prob1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		Comparator<Employee> myComparator = (o1, o2) ->{
			if(o1.getSalary()>o2.getSalary()) return 1;
			if(o1.getSalary()<o2.getSalary()) return -1;
			return 0;
		};
		
		Collections.sort
		Collections.sort(table.entrySet(),myComparator);
		return null;
		
	}
	
}
