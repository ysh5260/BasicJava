package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//자동 타입 추론 type inference
		//생성시 타입 생략은 jdk 1.7부터 가능
		List<String> list = new ArrayList<>();
		
		//리스트 추가
		list.add("홍길동");
		list.add("Java");
		list.add("Servlet/JSP");
		list.add("JDBC");
		list.add(2,"Database");
		list.add("myBatis");

		for(int i = 0 ; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//리스트 삭제
		list.remove(1);
		list.remove(3);
		
		System.out.println();
		
		for(String string:list) {
			System.out.println(string);
		}
		
		//리스트 모두 삭제
		list.clear();
		System.out.println("총 갯수: "+list.size());
		
//		배열로 표현
//		String[] strArray = new String[4];
//		strArray[0] = "홍길동";
//		strArray[1] = "Java";
//		strArray[2] = "Servlet/JSP";
//		strArray[3] = "JDBC";
	}
}
