package chapter04;

public class ForMultiplicationTableExample {
	public static void main(String[] args){
		for(int m=2;m<9;m++) {
			System.out.printf("*** %d단 ***\n",m);
			for(int n=1;n<=9;n++) {
				System.out.printf("%d x %d = %d\n",m,n,m*n);
			}
		}
	}
}
