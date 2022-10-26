package chapter02_1;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		//입력(Input)
		//System.in.read(); 한글자씩 입력받는다.
		//Scanner라는 클래스를 이용
		//=> 데이터를 입력받아 원하는 타입으로 받아준다.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력하세요: ");
//		String name = scanner.nextLine();//문자열로 반환
//		System.out.println("이름은 " + name + "입니다.");
//		System.out.println("나이를 입력하세요: ");
//		int age = scanner.nextInt();
		
//		System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age + "입니다.");
	
		//확인문제 p.98 1번
//		String name = "감자바";
//		int age = 25;
//		String tel1="010", tel2="123", tel3="4567";
//		System.out.println("이름 : " + name);
//		System.out.print("나이 : "+ age + "\n");
//		System.out.printf("전화: %s-%s-%s",tel1,tel2,tel3);
		
		//확인문제 p.99 3번
		Scanner scanner = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String sn = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String pn = scanner.nextLine();
		
		System.out.println("\n[입력한 내용]");
		System.out.println(name);
		System.out.println(sn);
		System.out.println(pn);
	}
}
