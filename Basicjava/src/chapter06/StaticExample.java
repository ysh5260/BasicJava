package chapter06;

public class StaticExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "권나영";
		s1.no = "s304001";
		Student.checkoutTime = "18:00"; //정적멤버는 클래스 이름을 직접 써주면 됨

		Student s2 = new Student();
		s2.name = "김성준";
		s2.no = "s304002";
		Student.checkoutTime = "18:10";
		
		Student s3 = new Student();
		s3.name = "김용익";
		s3.no = "s304003";
		Student.checkoutTime = "21:27";

		System.out.println(s1.name);
		System.out.println(Student.checkoutTime);
		System.out.println(s2.name);
		System.out.println(Student.checkoutTime);
		System.out.println(s3.name);
		System.out.println(Student.checkoutTime);

	}
	
}
