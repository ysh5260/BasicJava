package Exercise04;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		
		System.out.print("철수: ");
		String cheolsu = scanner.next();
		System.out.print("영희: ");
		String younghee = scanner.next();
		
		if(cheolsu.equals(younghee)) {
			System.out.println("비김");			
		}
		else if(cheolsu.equals("가위")) {
			if(younghee.equals("바위"))
				System.out.println("결과: 영희 승리!");
			else
				System.out.println("결과: 철수 승리!");
		}
		else if(cheolsu.equals("바위")) {
			if(younghee.equals("보"))
				System.out.println("결과: 영희 승리!");
			else
				System.out.println("결과: 철수 승리!");
		}
		else if(cheolsu.equals("보")) {
			if(younghee.equals("가위"))
				System.out.println("결과: 영희 승리!");
			else
				System.out.println("결과: 철수 승리!");
		}
	}
}
/*if(cheolsu.equals(younghee)){
 * result="비김!";
 * } else if{
 * 	cheolsu.equals("가위")&&younghee.equals("바위")||
 *  cheolsu.equals("보")&&younghee.equals("가위")||
 *  cheolsu.equals("바위")&&younghee.equals("보")
 *  result = "영희 승리!";
 *  } else{
 * 		result = "철수 승리!"
 * 	} 
 * */
