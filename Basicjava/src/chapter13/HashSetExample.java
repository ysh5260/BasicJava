package chapter13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("java");
		set.add("Java");
		set.add("JAVA");
		set.add("myBatis");
		set.add("iBatis");
		set.add("JDBC");
		set.add("jdbc");
		set.add("jdbc");
		set.add("JDBC");
		System.out.println("집합의 갯수: " + set.size());
		Iterator<String>iterator = set.iterator();
		while(iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
	}
}
