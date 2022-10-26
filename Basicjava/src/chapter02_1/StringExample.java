package chapter02_1;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		
		String contents = "홍길동님\n직업: \"프로그래머\"";
	//줄바꿈 할 때 문자가 필요함 역슬래시\n 탭:\t
	//	System.out.println(contents);
	//	System.out.println(name + "님");
	//  System.out.println("직업: " +job);
		System.out.println("자바는");
		System.out.println("\n재미있는 \"프로그래밍\" 언어\n");
		System.out.println("입니다.");
	}
}