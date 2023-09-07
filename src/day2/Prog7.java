package day2;

import java.io.IOException;
import java.util.Scanner;

public class Prog7 {
	/*
	 * Programming Assignment 2-7
	 * In this exercise, you will write a program (called Prog7) that creates and outputs an SQL
	 * statement based on user input. The program prompts the user for the following pieces of
	 * information:
	 * table name
	 * number of column names
	 * column name (as many occurrences as there are column names)
	 * salary value
	 * For this exercise, the table name will refer to an imaginary database table that stores
	 * customer information, including name, zip, salary, and other columns that you may
	 * invent. The SQL statement that your program will output will be of the form
	 * SELECT <column names>
	 * FROM <table name>
	 * WHERE salary > <salary value>
	 * For example, if the user types in these values:
	 * table name = Customer
	 * number of column names = 5
	 * column name = firstname
	 * column name = lastname
	 * column name = salary
	 * column name = state
	 * column name = zip
	 * salary value = 55000
	 * then your program would produce the following output:
	 * SELECT firstname,lastname,salary,state,zip
	 * FROM Customer
	 * WHERE salary > 55000.0
	 * 
	 * IMPORTANT: The output of your program is simply the sql query – just a String –
	 * printed to the console window. You will not run your query against a real database in this
	 * exercise. The exercise is simply to create an sql query (not to run it).
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String tableName;
		int columnCount;
		String[] columns;
		double salaryValue;
		
		System.out.print("table name =");
		tableName = sc.nextLine();
		
		System.out.print("number of column names =");
		columnCount = Integer.parseInt(sc.nextLine());
		
		columns = new String[columnCount];
		
		for(int i=0;i<columns.length;i++) {
			System.out.print("column name =");
			columns[i] = sc.nextLine();
		}
		
		System.out.print("salary value =");
		salaryValue = Double.parseDouble(sc.nextLine());
		
		//Construct Output
		/*
		 * SELECT <column names>
		 * FROM <table name>
		 * WHERE salary > <salary value>
		 */
		
		System.out.print("SELECT ");
		for(int i=0;i<columns.length;i++) {
			System.out.print(columns[i]);
			if(i!=columns.length-1)
				System.out.print(",");
		}
		System.out.println("\nFROM "+tableName);
		System.out.print("WHERE salary > "+salaryValue);
	}

}
