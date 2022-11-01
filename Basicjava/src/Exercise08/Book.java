package Exercise08;

public abstract class Book {
	
	private int number;
	private String title;
	private String author;
	private static int countOfBooks;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		number = countOfBooks;
		countOfBooks++;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public abstract int getLateFee(int lateDays);
	
	public boolean equals(Object o) {
		if(this.title.equals(((Book)o).title) && this.author.equals(((Book)o).author)) {
			return true;
		}
		return false;
	}
	public int hashCode() {
		return super.hashCode();
	}
	
	public String toString() {
		return String.format("관리번호: %d, 제목: %s, 작가:%s (일주일 연체료: %d)", number,title, author, getLateFee(7));
	}
}
