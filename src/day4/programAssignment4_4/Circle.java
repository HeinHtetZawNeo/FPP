package day4.programAssignment4_4;

public class Circle {
	private int radius;

	public Circle(int r) {
		this.radius = r;
	}

	public int getRadius() {
		return this.radius;
	}

	public void setRadius(int r) {
		this.radius = r;
	}

	public double computeArea() {
		return Math.PI * this.radius * this.radius;
	}
}
