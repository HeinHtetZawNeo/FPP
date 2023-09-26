package StandardExamPractice.Dec2016.Prob1;

import java.util.Comparator;

public class SsnComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		Employee e1=(Employee) o1;
		Employee e2 =(Employee) o2;
		return e1.getSsn().compareTo(e2.getSsn());
	}

}
