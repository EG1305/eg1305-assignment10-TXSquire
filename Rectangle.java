package Rectangle;

public class Rectangle {

	double length;
	double width;

	public Rectangle() {
		this.length = 0;
		this.width = 0;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return length * 2 + width * 2;
	}

}
