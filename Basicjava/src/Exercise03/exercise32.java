package Exercise03;

import java.util.Scanner;
//메트로폴리스(거대도시)는 다음과 같은 2가지 조건 중 하나를 만족하여야 한다고 가정한다. 
//어떤 도시가 메트로폴리스인지를 알아보는 프로그램을 작성하여 보자.(삼항연산자 사용)
//1. 한 나라의 수도이고, 인구가 100만 이상이어야 한다. 
//2. 연 소득이 1억 이상인 인구가 50만 이상이어야 한다.
public class exercise32 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.print("수도입니까?(수도:1, 수도아님:0)");
		int capital = scanner.nextInt();//true/false로 할 수 있음 boolean capital = scanner.nextBoolean();
		System.out.print("총 인구는?(단위:만)");
		int population = scanner.nextInt();//
		System.out.print("연소득이 1억 이상인 인구는?(단위:만)");
		int yearpopulation = scanner.nextInt();
		
		//처리 
		
		String result = (capital == 1 && population>=100||yearpopulation>=50)?"이 도시는 메트로폴리스입니다.":"메트로폴리스가 아닙니다.";
		System.out.println(result);
	}
}
