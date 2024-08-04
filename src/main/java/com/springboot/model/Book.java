package com.springboot.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Book implements Comparable<Book> {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int bookId;
	
	@Column
	String bookname;
	
	@Column
	int status;

	public Book() {
		super();
	}

	public Book(int bookId, String bookname, int status) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.status = status;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public int compareTo(Book b) {
		// TODO Auto-generated method stub
		return this.bookname.compareTo(b.getBookname());
	}
	
}
