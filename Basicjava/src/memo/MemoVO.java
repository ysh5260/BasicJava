package memo;

import java.sql.Date;

//VO : Value Object
//DTO : Data Transfer Object
//Bean, Model(데이터)이라고도 표현 함
//Item : 모바일 분야에서 많이 사용
public class MemoVO {
	private int no;
	private String title;
	private String content;
	private String writer;
	private Date createDate;
	private Date modifyDate;
	public MemoVO() {
	}

	public MemoVO(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public MemoVO(int no, String title, String content, String writer, Date createDate, Date modifyDate) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	@Override
	public String toString() {
		return String.format("%s\t%s\t%s\t%s\t%s\t%s", no,title,content,writer,createDate,modifyDate);
		}
	
}
