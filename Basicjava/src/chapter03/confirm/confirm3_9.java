package chapter03.confirm;

import java.util.Scanner;

public class confirm3_9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 :");
		double num1 = scanner.nextDouble();
		System.out.print("두 번째 수 :");
		double num2 = scanner.nextDouble();
		
		System.out.println("----------------");
		
//		if(!(num2==0.0)) {
//			System.out.print("결과: "+(num1/num2));
//		}
//		else {
//			System.out.print("결과: 무한대");
//		}
//		double result = num1/num2;//num2의 값이 0이면 무한대로 나와야함, 문자가 포함되니가 String으로 씀
		String result = (num2==0.0||num2==0.0?"무한대":String.valueOf(num1/num2));

		System.out.println("결과 : "+result);
	}
}
