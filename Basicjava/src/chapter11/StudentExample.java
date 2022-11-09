package chapter11;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		HashMap<Student,String>hashMap = new HashMap<Student,String>();//학생의 번호와 점수를 저장
		
		hashMap.put(new Student(0, "1"), "95");
		
		String score = hashMap.get(new Student(0, "1"));
		System.out.println("1번 학생의 총점: " + score);
	}
}
