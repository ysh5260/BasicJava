package Exercise05;

import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
		Random random = new Random();
		
//		int diceSum = 0;
		int []diceCount = new int[6];

		for (int i = 0; i < 10000; i++) {
			diceCount[random.nextInt(6)]++; 
		}
		System.out.println("------------");
		System.out.println("면\t빈도");
		System.out.println("------------");

		for (int i = 0; i < diceCount.length; i++) {
			System.out.printf("%d\t%d\n",(i+1),diceCount[i]);
		}
		
//		for (int j = 0; j <=5 ; j++) {
//			diceSum+=diceCount[j];
//			System.out.println((j+1)+"   "+diceCount[j]);
//		}
	}
}
