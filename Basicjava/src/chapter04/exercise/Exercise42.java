package chapter04.exercise;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12): ");
		int month = scanner.nextInt();
		String season = "";
		if(month>=3 && month<=5) {
			season = "계절: 봄";
		}else if(month>=6 && month<=8) {
			season = "계절: 여름";
		}else if(month>=9 && month<=11) {
			season = "계절: 가을";
		}else if(month==12||(month>=1 && month<=2)) {
			season = "계절: 겨울";
		}else
		season = month +"월은 잘못된 입력입니다.";
		System.out.println(season);
	}
}
// switch()
// int month = scanner.nextInt
/* String result = "";
 * switch(month)
 * case3:case4:case5:
 * result="봄";
 * break;
*/
 