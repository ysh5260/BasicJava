package chapter11;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");			
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		}else {
			System.out.println("obj1과 obj3는 동등하지 않습니다.");			
		}
	}
}
/*
 * toString(), hashCode(), equals()는 필드를 갖는 클래스라면
 * 반드시 재정의 해주는 것이 좋다.
 * 필드를 private를 사용하면서, getter, setter가 필요하고 출력시에도  toString이 필요함
 * 
 * 그런데 위 내용을 매번 작성하기 시간이 오래걸려 나온 솔루션이 Lombok이다.
 */