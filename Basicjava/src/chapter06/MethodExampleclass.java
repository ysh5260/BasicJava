package chapter06;

public class MethodExampleclass {
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;
	}
	void run() {
		divide(10,20);
	}
	public static void main(String[] args) {
		MethodExampleclass class1 =new MethodExampleclass();
		class1.run();
	}
}
