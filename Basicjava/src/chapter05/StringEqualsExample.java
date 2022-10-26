package chapter05;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		System.out.println(strVar1 == strVar2);//문자열은 객체가 같은 위치에 있지 않음, false가 나와야함 ->주소 값을 비교하는 것임
//		System.out.println("신민철".equals("신민철"));
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		System.out.println(strVar3==strVar4);//주소 값을 비교하여 출력하려면 new String을 써서 비교해야함 new()객체 사용
	}
}
