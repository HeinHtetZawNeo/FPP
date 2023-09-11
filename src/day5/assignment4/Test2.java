package day5.assignment4;

public class Test2 {

	public static void main(String[] args) {

		// Polygon is interface //Triangle is child class
		Polygon[] pList = { new Square(3), new Triangle(4, 5, 6), new Ractangle(3, 4) };

		// compute areas
		for (Polygon p : pList) {
			System.out.printf("The area of this %s \n", p.getClass().getSimpleName());
			System.out.printf("\t Number of sides = %d \n", p.getNumberOfSides());
			System.out.printf("\t Perimeter = %.1f \n", p.computePerimeter());
		}

	}

}
