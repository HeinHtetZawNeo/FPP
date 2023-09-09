package day5.assignment1;

import java.util.GregorianCalendar;

public class DeptEmployee {
	private String name;
	private GregorianCalendar hireDate;
	private double salary = 0;
	
	public DeptEmployee(String n,GregorianCalendar hd, double s) {
		this.name = n;
		this.hireDate = hd;
		this.salary = s;
	}
	public String getName() {
		return this.name;
	}
	
	public GregorianCalendar getHireDate() {
		return this.hireDate;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setHireDate(GregorianCalendar hd) {
		this.hireDate = hd;
	}
	
	public double computeSalary() {
		return salary;
	}
}
