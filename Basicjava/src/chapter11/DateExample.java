package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date); //Mon Nov 07 12:30:11 KST 2022

//		Date.getYear() -> 사용불가
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //MM(월)과 mm(분)은 대문자와 소문자로 구분해준다
		String dateStr = format.format(date); //2022-11-07 12:30:11
		
		System.out.println(dateStr);
//		Date -> LocalDate or LocalDateTime으로 사용
		LocalDateTime now = LocalDateTime.now();
		String dateStr2 = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초"));//2022년 11월 07일 월요일 12시 33분 40초
		System.out.println(dateStr2);
	}
}
