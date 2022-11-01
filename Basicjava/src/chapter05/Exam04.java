package chapter05;

public class Exam04 {
	public static void main(String[]args) {
		int max = 0;
		int []array = {1,5,3,8,2};
		for (int i = 0; i < array.length; i++) {
			if(max<array[i]) {//max와 배열안의 값을 비교 후 배열의 값보다 작은 값을 max에 저장
				max = array[i]; //max 값은 array[3]값인 8로 저장됨
			}
		}
		System.out.println("max: "+max);		
	}
}
