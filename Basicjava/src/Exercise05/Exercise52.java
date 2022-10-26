package Exercise05;

import java.util.Arrays;
import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		
		Random random = new Random();
		int []lotto = new int[6] ;
		for (int i = 0; i < lotto.length; i++) {
			int num = random.nextInt(45)+1; //1-45까지의 랜덤한 숫자 한 개가 나옴
			lotto[i] = num; 
		
			for (int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.println("로또번호 : "+ lotto[i]);
//		} 출력을 for문 안에서 해주게 되면 숫자를 빼고도 계속 반복돼서 7개가 나오고 중복도 나올 수 있음
		//그래서 for문 밖에서 다시 반복문 만들어서 출력해주어야함
		
		System.out.println("로또번호 : " + Arrays.toString(lotto));
	}
}
