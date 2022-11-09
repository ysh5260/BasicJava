package Exercise05;

public class Exercise51 {
	public static void main(String[] args) {
		int []array = {38,94,16,3,76,94,82,47,59,8};
		
//		int max = 0; // int 타입의 최솟값으로 시작하는게 좋음 Integer.minvalue
//		int min = array[0];//int 타입의 최댓값으로 시작하는게 좋음 Integer.max_value
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(max<array[i]) { //array[i]>max 이렇게 쓰는게 더 좋음
				max = array[i];
			}
			if(min>array[i]) { 
				min=array[i];
			}
		}
		System.out.println("배열의 최대값: "+max);
		System.out.println("배열의 최소값: "+min);
	}
}
