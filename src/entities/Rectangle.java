package entities;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double area () {
		return width * height;
	}
	
	public double perimeter () {
		return (width + height)*2;
	}
	
	public double diagonal () {
		return Math.sqrt(width * width + height * height);
	}
}
