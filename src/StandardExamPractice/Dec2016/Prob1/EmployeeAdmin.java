package StandardExamPractice.Dec2016.Prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input
	 * list socSecNums and whose salary is > 80000. The list must be ordered by
	 * social security number, from lowest to highest. To sort, you must use a
	 * Collections sorting method and you must define your own Comparator to be
	 * used to compare Employees by ssn.
	 */
	
	public static List<Employee> prepareReport(HashMap<String, Employee> table,
			List<String> socSecNums) {
		// IMPLEMENT
		List<Employee> emps = new ArrayList<Employee>();
		Set set = table.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			String key = (String) entry.getKey();
			Employee emp = (Employee) entry.getValue();
			if (socSecNums.contains(key) && emp.getSalary()>80000) {
				emps.add(emp);
			}

		}
		Collections.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSsn().compareTo(e2.getSsn());
			}
		});
		return emps;

	}

}
