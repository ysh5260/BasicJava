package Exercise03;

import java.util.Scanner;
//입력 연도가 윤년인지 아닌지 확인하는 프로그램을 작성해보자. 
//윤년의 조건은 다음과 같다고 가정한다.
//윤년은 4의 배수이어야 하고, 100의 배수는 아니어야 한다. 
//또한 400의 배수는 무조건 윤년이 된다.

public class exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int year = scanner.nextInt();
		
		System.out.println(year%4==0&&!(year%100==0)||year%400== 0? year + " 윤년입니다":year+" 윤년이 아닙니다.");
	//System.out.println(year+"년은"+result)
	}
}
