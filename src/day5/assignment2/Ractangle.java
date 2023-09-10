package day5.assignment2;

public class Ractangle extends ClosedCurve{

	private double width;
	private double length;
	
	public Ractangle(double width, double length) {
		this.width =width;
		this.length = length;
	}
	@Override
	double computeArea() {
		return this.width * this.length;
	}
}
