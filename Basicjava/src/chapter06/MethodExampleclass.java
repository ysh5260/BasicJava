package chapter06;

public class MethodExampleclass {
	double divide(int x, int y) {
		return (double)x/y;
	}
	void run() {
		double divide = divide(10,20);
		System.out.println(divide);
	}
	public static void main(String[] args) {
		MethodExampleclass class1 =new MethodExampleclass();
		class1.run();
	}
}
