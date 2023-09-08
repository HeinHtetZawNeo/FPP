package day4.programAssignment4_4;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
	}

	public int getLength() {
		return this.length;
	}

	public int getWidth() {
		return this.width;
	}

	public void setLength(int l) {
		this.length = l;
	}

	public void setWidth(int w) {
		this.width = w;
	}

	public double computeArea() {
		return this.length * this.width;
	}
}
