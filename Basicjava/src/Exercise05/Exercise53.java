package Exercise05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String []game = {"가위","바위","보"};
		System.out.println("가위 바위 보를 입력하세요: ");
		System.out.print("게이머: ");
		String gamer = scanner.nextLine();
		
		String result = "";
		
		int num = random.nextInt(3);
		//String computer = game[random.nextInt(3)];
		System.out.println("인공지능 컴퓨터: "+game[num]);
		
		if(game[num].equals(gamer)) {
			result = "비김";
		}else if(gamer.equals("가위")&&game[num].equals("바위")||
			gamer.equals("바위")&&game[num].equals("보")||
			gamer.equals("보")&&game[num].equals("가위")) {
			result="컴퓨터 승리!";
		}else {
			result = "게이머 승리";
		}
		System.out.println(result);	
	}
}