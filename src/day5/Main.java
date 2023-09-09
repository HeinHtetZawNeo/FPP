package day5;

public class Main {

	public static void main(String[] args) {
		/*Manager m = new Manager("hi"); 		//I am a Person
											//I am a Manager
		m.printOut();						//I am from manager
		
		Person p = new Manager("hi again");	//I am a Person
											//I am a Manager
		p.printOut();						//I am from manager
		
		Person p1 = new Person(); 		//I am a Person
		p1.printOut();					//I am from Person
		*/
		Integer x = new Integer(5);
		System.out.println(x);
		method(x);
		System.out.println(x);
	}
	
	static void method(Integer x) {
		  x = 10;
		  System.out.println(x);  
	}
}
