package chapter06;

public class Member {
	String name;
	String id;
	String password;
	int age;
	public Member() {
		
	}
	public Member(String name) {// String name = "홍길동"
		this.name = name; //this 는 현재객체 
		System.out.println(this);
	}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
