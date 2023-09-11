package day5.assignment4;

public class Ractangle extends ClosedCurve implements Polygon{

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
	
	@Override
	public int getNumberOfSides() {
		return 4;
	}
	
	@Override
	public double computePerimeter() {
		return 2*(this.length+this.width);
	}
}
