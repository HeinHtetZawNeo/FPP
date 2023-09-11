package day5.assignment4;

public class Test {
	
	public static void main(String[] args) {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Ractangle(3, 7),
								 new Circle(3)
								 };
		//compute areas
		for(ClosedCurve cc : objects) {
			System.out.printf("The area of this %s is %.2f \n",cc.getClass().getSimpleName(),cc.computeArea());
			
		}
    
	}

}