package chapter04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int randNum = random.nextInt(100)+1;
		int count = 0;
		
		while(true) {
		System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
		int num = scanner.nextInt();
		if(num==randNum) {
			count++;
			break;
			}else if(num<randNum) {
			System.out.println("정답은 더 큰 수입니다.");
			count++;
			}else {
			System.out.println("정답은 더 작은 수 입니다.");
			count++;
		}
	}	System.out.println("정답입니다.");
		System.out.println("게임을 종료합니다.");
		System.out.println(count +"번 만에 정답!");
		
	}	
}
