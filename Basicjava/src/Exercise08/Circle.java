package Exercise08;

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
		return String.format("도형의 종류: 원, 둘레: %.2fcm, 넓이:%.2fcm²", perimeter(),area()); //소숫점 아래 15자리 까지 출력
	}
}
