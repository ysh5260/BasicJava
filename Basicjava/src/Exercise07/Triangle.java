package Exercise07;

public class Triangle extends Shape {
	private double side;
	
	public Triangle(double side) {
		this.side = side;
	}
	@Override
	public double area() {
		return side*side*(Math.sqrt(3)/4);
	}
	@Override
	public double perimeter() {
		return 3*side;
	}
	public String toString() {
		return String.format("도형의 종류: 삼각형, 둘레: %.1fcm, 넓이:%.16fcm²", perimeter(),area());
	}
}
