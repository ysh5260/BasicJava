package chapter06;

public class PersonExample {
	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		person1.name = "홍길동";
		person1.age = 25;
		
		person2.name = "이순신";
		person2.age = 30;
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person2.name);
		System.out.println(person2.age);
	}
}