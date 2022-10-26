package chapter06;

public class Student {
	String name; //인스턴스
	String no; //인스턴스
	Book book; //인스턴스
	static String checkoutTime; //정적멤버
	public Student() {
		book = new Book();
		book.title = "혼공자바";
	}
}
class Book{
	String title;
}
