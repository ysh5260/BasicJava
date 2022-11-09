package Exercise08;

public abstract class Shape implements Comparable<Shape> {
	
	public abstract double area();
	public abstract double perimeter();

	@Override
	public int compareTo(Shape o) {
		if(o.area()>this.area()) { //현재객체가 o보다 작으면 음수
			return -1;
		}else if (o.area()<this.area()) {//현재 객체가 o보다 크면 양수
			return 1;
		}else {
			return 0;
		}	
	}
}
