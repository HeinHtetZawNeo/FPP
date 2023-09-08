package day4.programAssignment4_4;

public class Main {

	public static void main(String[] args) {
		Circle cr = new Circle(3);
		Rectangle rec = new Rectangle(3, 4);
		Triangle tri = new Triangle(5, 4);
		
		System.out.printf("Area of Circle is %.2f \n",cr.computeArea());
		System.out.printf("Area of Rectangle is %.2f \n",rec.computeArea());
		System.out.printf("Area of Triangle is %.2f \n",tri.computeArea());
	}

}
