package chapter11;

public class StringValueOfExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
/*
 * 정규표현식(regular expression)
 * 문자열 -> 검색
 * 어떤 패턴을 검색하고 싶을 때 사용
 * 글자+갯수 생략하면 1이다
 * 글자를 표현하는 기호와 갯수를 표현하는 기호가 존재
 */