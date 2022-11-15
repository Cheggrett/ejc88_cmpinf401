package ejc88_lab9;

public final class Cylinder extends Circle{
private double height;

public Cylinder() {
	super();
	setHeight(1.0);
	
}
public Cylinder(double radius, double height) {
	super(radius);
	setHeight(height);
	
}
public Cylinder(double radius, double height, String color) {
	super(radius, color);
	setHeight(height);
	
}
public double getVolume() {
	double volume;
	volume = Math.PI*(super.getRadius()*super.getRadius())*height;
	return volume;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

}
