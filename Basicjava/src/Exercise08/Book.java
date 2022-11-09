package Exercise08;

import java.util.Objects;

public abstract class Book {
	
	private int number;
	private String title;
	private String author;
	private static int countOfBooks;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		number = ++countOfBooks;
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

	public boolean equals(Object o) {//casting 해줘야됨
		if(this == o) {// 현재객체랑 같은지 비교
			return true;
		}
		if(!(o instanceof Book)) { //Object o = "홍길동"; Book 타입이 아닐 때는 false를 반환한다.
			return false;
		}
		Book book = (Book)o;
		if(this.author.equals(book.author)&& this.title.equals(book.title)) {
			return true;
		}
		return false;
		
//		if(this.title.equals(((Book)o).title) && this.author.equals(((Book)o).author)) {
//			return true;
//		}
//		return false;
		
	}
	
//객체들이 가지고 있는 고유한 정보를 가지고 있으면 같은 객체라고 판단함
//해시코드가 같으면 그 다음에 equals를 비교해줌
	public int hashCode() {
//		return super.hashCode();
//		return Objects.hashCode(author)*Objects.hashCode(title);
		return Objects.hash(author,title);
	}
	
	public String toString() {
		return String.format("관리번호: %d, 제목: %s, 작가:%s (일주일 연체료: %d)", number,title, author, getLateFee(7));
	}
}
