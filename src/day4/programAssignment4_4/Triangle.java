package day4.programAssignment4_4;

public class Triangle {
	private int base;
	private int height;

	public Triangle(int b, int h) {
		this.base = b;
		this.height = h;
	}

	public int getBase() {
		return this.base;
	}

	public int getHeight() {
		return this.height;
	}

	public void setBase(int b) {
		this.base = b;
	}

	public void setHeight(int h) {
		this.base = h;
	}

	public double computeArea() {
		return (this.base * this.height) / 2;
	}
}
