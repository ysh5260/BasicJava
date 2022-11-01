package Exercise08;

public abstract class Shape implements Comparable<Shape> {
	
	public abstract double area();
	public abstract double perimeter();

	@Override
	public int compareTo(Shape o) {
		if(o.area()>area()) {
			return -1;
		}else if (o.area()<area()) {
			return 1;
		}else {
			return 0;
		}	
	}
}
