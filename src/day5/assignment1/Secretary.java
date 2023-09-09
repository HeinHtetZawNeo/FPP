package day5.assignment1;

import java.util.GregorianCalendar;

public class Secretary extends DeptEmployee {
	private double overtimeHours;

	public Secretary(String n,GregorianCalendar hd, double s,double overtime) {
		super(n, hd, s);
		this.overtimeHours = overtime;
		
	}
	public double getOvertimeHours() {
		return this.overtimeHours;
	}

	public void setOvertimeHours(double oth) {
		this.overtimeHours = oth;
	}

	public double computeSalary() {
		return super.computeSalary() + (12 * this.overtimeHours);
	}
}
