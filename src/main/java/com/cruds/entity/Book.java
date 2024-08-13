package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book
{
	@Id
	private int bookId;
	
	@Column(length=100,nullable=false)
	private String bookTitle;

	public Book(int bookId, String bookTitle) 
	{
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}
	
	
	public Book() 
	{
		super();
	}


	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() 
	{
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + "]";
	}
}
