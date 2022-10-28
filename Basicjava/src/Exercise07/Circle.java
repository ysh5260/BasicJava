package Exercise07;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		return radius*radius*Math.PI;
	}
	@Override
	public double perimeter() {
		return 2.0*Math.PI*radius;
	}
	public String toString() {
		return String.format("도형의 종류: 원, 둘레: %.15fcm, 넓이:%.15fcm²", perimeter(),area());
	}
}
