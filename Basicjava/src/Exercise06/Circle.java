package Exercise06;

public class Circle {
	
	private double radius;
	private double x;
	private double y;
	private double getArea;
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius<0) {
			this.radius = 0.0;
			return;
		}else {
			this.radius = radius;
		}
	}
	double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getArea() {
		getArea= radius*radius*Math.PI;
		return getArea;
	}
	public void getArea(double getArea) {
		this.getArea =getArea;
	}
    
}
