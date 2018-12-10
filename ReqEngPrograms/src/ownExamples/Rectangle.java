package ownExamples;

public class Rectangle {
	
	private double length, width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		
	}
	
	public double calcArea() {
		double area = this.length * this.width;
		
		return area;
	}
	
	public double calcScope() {
		double scope = (this.length + this.width) * 2;
		
		return scope;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
