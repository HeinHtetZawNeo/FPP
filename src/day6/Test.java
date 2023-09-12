package day6;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {

		List<ClosedCurve> objects = new ArrayList<ClosedCurve>();
		
		objects.add(new Square(3));
		objects.add(new Ractangle(3, 7));
		objects.add(new Circle(3));
		
		for(int i=0;i<objects.size();i++) {
			System.out.printf("The area of this %s is %.2f \n",objects.get(i).getClass().getSimpleName(),objects.get(i));
		}
    
	}

}