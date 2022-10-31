package Exercise07;

public class Student extends Human{
	private String major;
	
	public Student(String name, int age, String major) {
		super(name,age); //부모클래스에서 이름이랑 나이 가져옴
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String toString() {
		return super.toString()+"전공:" + major;
	}
}
