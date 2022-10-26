package chapter05_1;
import java.util.Random;
public class ArrayExample {
	public static void main(String[] args) {
		/*참조타입
		 * []: 인덱싱, 배열 만들 때, 선언할 때
		 * 1차 배열 확장 => 2차,3차(X)
		 */
		//index는 0부터 시작
		//String[] name = new String[25];
		//Random 객체 15개 를 배열로 만든다
		
		Random[] random = new Random[15];
		random[0]=new Random();
		random[1]=new Random();

		
		int ranNum = random[0].nextInt(10);
		double ranDouble = random[1].nextDouble();
		
		//Boolean 타입 데이터 25개를 배열로 만든다.
		boolean[] flags = new boolean[25];
		flags[0] = false;  //flags1=false
		flags[1] = true;   //flags2=true
		
		//리터럴 형식으로 표현 중괄호를 쓴다.
		int[] nums = {1,2,3};

		
		
	}
}
