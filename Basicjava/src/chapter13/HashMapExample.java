package chapter13;

import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
//		map = new Hashtable<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		Integer hongValue = map.get("홍길동");
		System.out.println(hongValue);
		
		// Entry 활용
//		Set<Entry<String,Integer>>entrySet =  map.entrySet();
	}
}
