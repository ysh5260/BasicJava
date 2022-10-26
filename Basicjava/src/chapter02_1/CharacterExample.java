package chapter02_1;

public class CharacterExample {
	public static void main(String[] args) {
		//char(Character)
		char c1 = 'a'; // 실제 : 97
		//char c2 = 'ab'; char는 하나의 문자만 가능 두글자는 불가능
		char c3 = '가'; //실제 : 44032
		char c4 = 65;
		char c5 = 44032;
	
		//String(문자열) => 참조타입
		String s1 = "a";
				
		System.out.println(c1);
		System.out.println(c4);
		System.out.println(c5);
	}
}
