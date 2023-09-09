package day5.assignment1;

import java.util.GregorianCalendar;

public class Administrator extends DeptEmployee{
	private int numberOfWorkingHour;
	public Administrator(String n, GregorianCalendar hd, double s,int numberOfWorkingHour) {
		super(n,hd,s);
		this.numberOfWorkingHour = numberOfWorkingHour;
	}
	public void setNumberofWorkingHour(int numberOfWorkingHour) {
		this.numberOfWorkingHour = numberOfWorkingHour;
	}
	public int getNumeroOfWorkingHour() {
		return this.numberOfWorkingHour;
	}
	public double getSalary() {
		return numberOfWorkingHour*20;
	}
}
