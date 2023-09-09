package day5.assignment1;

import java.util.GregorianCalendar;

public class Professor extends DeptEmployee{
	private int numberOfPublications;
	
	public Professor(String n, GregorianCalendar hd, double s,int noOfPublication) {
		super(n,hd,s);
		this.numberOfPublications = noOfPublication;
	}
	public int getNumberOfPublications() {
		return this.numberOfPublications;
	}
	
	public void setNumberOfPublications(int nop) {
		this.numberOfPublications = nop;
	}
}
