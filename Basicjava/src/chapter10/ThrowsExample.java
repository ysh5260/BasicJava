package chapter10;

public class ThrowsExample {
//	public static void main(String[] args) throws Exception { //에러 떠넘기기
//		run();
//	}
//	private static void run() throws ClassNotFoundException {
//		Class.forName("java.lang.String");
//	}
// throws :  메소드 호출한 위치로 예외를 떠넘긴다.
// throw : 직접 예외를 발생시킨다.=> 일반예외에 작성되어 있다
	public static void main(String[] args) {
		try {
			run();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void run() throws Exception{
		Class.forName("java.lang.String");
	}
}
