package chapter11;

public class Mem {
	private String id;
	private String name;
	
	public Mem(String id,String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id + " : " +name;
	}
}
