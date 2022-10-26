package chapter05_1;

import java.util.Arrays;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[]scores= {95,71,84,93,87};
		int sum = 0;
//		for(int i=0;i<scores.length;i++) {
//			sum+=scores[i];			
//		}
		//2.향상된 for문(Advanced for Loop):foreach
		// there is something in everything.
		for (int score : scores) {
			sum += score;
		}
		// 3.forEach라는 메소드를 이용
//		Arrays.asList(scores).forEach(null);
//		jdk 1.8에 stream + lambda를 이용해서 함수형 프로그래밍 구현		
		System.out.println(sum);
	}
}
