package com.example.springboot.sprintbootbasics.beans;

public class Book {
	
	long bookID;
	
	String bookName, author;
	
	

	public Book(long bookID, String bookName, String author) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.author = author;
	}

	public long getBookID() {
		return bookID;
	}

	public void setBookID(long bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	

}
