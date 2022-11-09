package chapter13;

public class GenericExample {
	public static void main(String[] args) {
		//Generic(제네릭 or 지네릭)
		//데이터 저장 용도로 객체를 많이 사용
		//int 하나의 데이터를 저장한다.
		//String 하나의 데이터를 저장한다.
		//=> 타입 안정성 및 가독성 향상(강제 캐스팅이 없으니까)
		Box<Integer> box = new Box<Integer>(10);
		System.out.println(box.getValue());
		Box<String> box2 = new Box<String>("홍길동");
		System.out.println(box2.getValue());
		
		String result = box.getValue() + box2.getValue();
		System.out.println(result);
	}
}
