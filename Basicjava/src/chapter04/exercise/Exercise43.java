package chapter04.exercise;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int score1 = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int score2 = scanner.nextInt();
		System.out.print("화면 구현: ");
		int score3 = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int score4 = scanner.nextInt();
		System.out.print("머신러닝: ");
		int score5 = scanner.nextInt();
		
		int sum = score1+score2+score3+score4+score5;
		System.out.println("총점: "+sum);
		double average = sum/5.0;
		System.out.printf("평균: %.2f\n",average);
		
		String grade = "";
		switch((int)average/10){
			case 10: case 9: 
				grade = "A";
				break;
			case 8:
				grade ="B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade ="D";
				break;
			default:
				grade = "F";
				break;
		}
		System.out.print("학점 : "+ grade);
		
//		if(average>=90) {
//			System.out.println("학점: A");
//		}else if(average>=80) {
//			System.out.println("학점: B");
//		}else if(average>=70) {
//			System.out.println("학점: C");
//		}else if(average>=60) {
//			System.out.println("학점: D");
//		}else
//			System.out.println("학점: F");
		}
}
