package day4.prog4_1;
import java.util.*;

public class Employee {
	
	private String name;
	private String nickName;
	private double salary;
	private GregorianCalendar hireDay;

	public Employee(String aName,String aNickName,
	         double aSalary,int aYear,
	         int aMonth,int aDay) 
	{
		this.name = aName;
		this.nickName = aNickName;
		this.salary = aSalary;

		this.hireDay = new GregorianCalendar(aYear,aMonth-1,aDay);

	}
	
	public String getName() {
		return this.name;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String aNickName) {
		this.nickName = aNickName;
	}
	public double getSalary() {
		return this.salary;
	}

	public GregorianCalendar getHireDay() {
		return this.hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		this.salary += raise;
	}

	public double yearlyFederalTax () {
		
		if(this.salary>80000)
			return this.salary * 0.28;
		
		if(this.salary > 50000)
			return this.salary * 0.24;
		
		if(this.salary > 26000)
			return this.salary * 0.20;
		
		return 0;
	}
}
