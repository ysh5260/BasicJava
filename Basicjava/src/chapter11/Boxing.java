package chapter11;

public class Boxing {
	public static void main(String[] args) {
		//실제로 어떻게 써야하나
		long startTime1 =System.nanoTime();
		int sum = 0;
		for(Integer i = 1; i<=1_000_000;i++) {
			sum+=i;
		}
		long endTime1 = System.nanoTime();
		
		System.out.println("걸린시간 : "+(endTime1 - startTime1));
	}
}
