package chapter09;

import chapter09.OuterClass.InnerClass;
//import chapter09.OuterClass.StaticInnerclass;

public class OuterClassExample {
	public static void main(String[] args) {
//		OuterClass outerClass = new OuterClass();
//		outerClass.name = "새로 저장된 데이터";
//		System.out.println(outerClass.name);
		
		OuterClass outerClass = new OuterClass();
		InnerClass innerclass = outerClass.new InnerClass();
		System.out.println(innerclass.name);
		
//		StaticInnerclass staticInnerClass = new StaticInnerclass();
//		System.out.println(staticInnerClass.age);
	}
}
