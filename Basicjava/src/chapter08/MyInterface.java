package chapter08;

public interface MyInterface {
	
	//데이터는 저장 불가능
	//모든 메소드가 추상메소드
	//body를 구현하면 안됨 -> 에러 남 , 선언만 해야됨
	
	int max_volume = 10; //상수임. 인터페이스는 변수와 필드가 없기때문에 선언하면 상수가 됨 
	//static final로 알아서 해줌
	
	//public abstract void turnOn(); 모든메소드가 추상메소드
	//public abstract 생략해준다.
	void turnOn();
	void turnOff();
}
