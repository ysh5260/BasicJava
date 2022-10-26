package chapter02.exercise;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위:cm): ");
		double r = scanner.nextDouble();
		System.out.print("원기둥 높이를 입력하시오.(단위:cm): ");
		double h = scanner.nextDouble();
		
		double area = r*r*Math.PI;
		double volume = area*h;
		
		System.out.println("원기둥 밑변의 넓이는 "+area+ "cm²이고, 원기둥의 부피는 " + volume +"cm²이다.");

	}
}
