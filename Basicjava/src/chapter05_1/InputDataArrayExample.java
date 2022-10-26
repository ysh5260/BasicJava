package chapter05_1;

import java.util.Iterator;

public class InputDataArrayExample {
	public static void main(String[] args) {
		byte[]bytes;
		bytes = new byte[] {1,2,3,4,5};
		
		int[] numArr = {1,2,3,4,5,6,7,8,9,10}; //배열에서 리터럴 형식으로 초기화 할 때는 선언과 동시에만 가능
		int[] nums = new int[10];
		
		numArr[4]=100;
		for (int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);//0으로 초기화해서 출력
		}
		
	}
}
