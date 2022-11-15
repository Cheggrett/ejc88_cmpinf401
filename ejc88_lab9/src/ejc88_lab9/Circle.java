package ejc88_lab9;

public class Circle {

	private double radius;
	private String color;

	public Circle() {
		setRadius(5.0);
		setColor("Green");
	}
	public Circle(double radius) {
		setRadius(radius);
		setColor("green");
		
	}
	public Circle(double radius, String color) {
		setRadius(radius);
		setColor(color);
	}

	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
