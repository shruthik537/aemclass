package com.java.bean;

public class bookDetails {
	
	private String authorname;
	private int bookid;
	private String bookname;
	
	
	public bookDetails(String authorname, int bookid, String bookname) {
		this.authorname = authorname;
		this.bookid = bookid;
		this.bookname = bookname;
		
	}
	
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
		@Override
	public String toString() {
		return "bookDetails [authorname=" + authorname + ", bookid=" + bookid + ", bookname=" + bookname
				+ "]";
	}
	

}
