package chapter04.confirm;

public class Exercise06 {
	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=4;j>0;j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
			}
		}
		System.out.println();
	}
}
}