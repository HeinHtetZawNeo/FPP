package day5.assignment1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Professor p1 = new Professor("Prof.A", new GregorianCalendar(1990, 10, 2),2500,10);
		Professor p2 = new Professor("Prof.B", new GregorianCalendar(1989, 1, 12),2000,10);
		Professor p3 = new Professor("Prof.C", new GregorianCalendar(1992, 5, 25),3300,10);
		
		Secretary s1 = new Secretary("Mrs.A", new GregorianCalendar(2000,4,3), 1000, 200);
		Secretary s2 = new Secretary("Mrs.B", new GregorianCalendar(2020,1,4), 1200, 200);
		
		
		
		DeptEmployee[] deList = new DeptEmployee[7];
		deList[0] = p1;
		deList[1] = p2;
		deList[2] = p3;
		deList[3] = s1;
		deList[4] = s2;
		deList[5] = new Administrator("Mr.D", new GregorianCalendar(2010,4,3), 800, 900);
		deList[6] = new Administrator("Mr.E", new GregorianCalendar(2009,1,13), 1800, 500);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Do you wish to see all the salary in the department? [y/n]");
		String result = sc.nextLine();
		
		if(result.equals("y")) {
			double totalSalary = 0;
			for(DeptEmployee dep:deList) {
				totalSalary+=dep.computeSalary();
			}
			System.out.println("total Salary is "+totalSalary);
			
			
		}
		
		System.out.print("Do you want to search with Name? [y/n]");
		result = sc.nextLine();
		
		if(result.equals("y")) {
			System.out.print("Do you want to search with Name: ");
			result = sc.nextLine();
			
			for(DeptEmployee dep:deList) {
				if(dep.getName().equals(result)) {
					System.out.println("Name :"+dep.getName());
					System.out.println("Hire Date :"+dep.getHireDate().getTime());
					System.out.println("Salary :"+dep.computeSalary());
					if(dep instanceof Administrator) {
						System.out.println("Number of Working Hour :"+((Administrator)dep).getNumeroOfWorkingHour());
					}
					if(dep instanceof Professor) {
						System.out.println("Number of Publication :"+((Professor)dep).getNumberOfPublications());
					}
					if(dep instanceof Secretary) {
						System.out.println("Number of Publication :"+((Secretary)dep).getOvertimeHours());
					}
				}
			}
		}
	}

}
