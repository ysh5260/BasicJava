package Exercise08;

public class Poet extends Book{
	public Poet(String title, String author) {
		super(title,author);
	}
	public int getLateFee(int lateDays) {
		return 200*lateDays;
	}
}
