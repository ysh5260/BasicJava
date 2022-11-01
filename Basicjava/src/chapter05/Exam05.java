package chapter05;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
//		int [][]array = {{95,86},{83,92,96},{78,83,93,87,88}};
//		int sum = 0;
//		double avg = 0.0;
//		int count = 0; -> count 값 초기화		
//		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				sum +=array[i][j];  -> 배열에 저장된 값을 sum에 더하는 수식
//				count++; -> avg를 구하기 위해서 array[i][j]의 갯수가 몇 개인지 세는 것
//			}			
//		}
//		avg = (double)sum/count; 
//		System.out.println("sum: "+sum);
//		System.out.println("avg: "+avg);
		
		//Exam06
		boolean run = true;
		int studentNum = 0;
		int[]scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo==1) {
				System.out.print("학생수> "); 
				studentNum = Integer.parseInt(scanner.nextLine()); //학생 수 입력 받음
				scores = new int[studentNum]; //입력받은 학생수를 초기화 된 scores 배열에 저장 
				}else if(selectNo==2) {
				for (int i = 0; i < scores.length; i++) {//scores 배열의 길이만큼 실행
					System.out.print("score["+i+"]> "); //printf("score[%d]",i);
					scores[i] = Integer.parseInt(scanner.nextLine());//scores 배열의 값을 위에서 받은 학생 수만큼 점수를 입력
				}
			}else if(selectNo==3) {
				for (int i = 0; i < scores.length; i++) { 
					System.out.println("scores["+i+"]> "+scores[i]);//scores 배열을 보여줌	
				}
			}else if(selectNo==4) {
				int sum = 0;
				double avg = 0;
				int max = 0;
				
				for (int i = 0; i < scores.length; i++) {
					if(max<scores[i]) {//scores를 비교하여 제일 큰 값이 무엇인지 비교
						max = scores[i]; 
					}
						sum+=scores[i];//각 배열에 저장된 값을 sum에 더하는 수식
				}
				avg = (double)sum/studentNum; //sum을 위에서 입력받은 학생수로 나눠 평균을 구하는 수식
				System.out.println("최고 점수: "+ max);
				System.out.println("평균 점수: "+avg);
			}//selectNo ==4 문 끝
			else if(selectNo==5) {
				run = false;
			}			
		}System.out.println("프로그램 종료");
	}
}
