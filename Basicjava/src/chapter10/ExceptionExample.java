package chapter10;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {//예외에 대한 정보를 e라는 변수가 가지고 있음
//			e.printStackTrace(); //추적하는 메소드, 에러 내용을 그대로 출력해줌
			System.out.println("패키지명이나 클래스명이 잘못되었습니다.");
		}
	}
}
