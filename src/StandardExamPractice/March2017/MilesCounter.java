package StandardExamPractice.March2017;

import java.util.ArrayList;
import java.util.List;

public class MilesCounter {
	public static List<Vehicle> convertArray(Object[] vehicleArray) {
		List<Vehicle> vehicalList = new ArrayList<Vehicle>();
		for(Object o:vehicleArray) {
			vehicalList.add((Vehicle)o);
		}
		return vehicalList;
	}
	
	
	public static int computeTotalMiles(List<Vehicle> vehicleList) {
		int totalMiles = 0;
		for(Vehicle v:vehicleList) {
			totalMiles += v.getMilesUsedToday();
		}
		return totalMiles;
	}
}
