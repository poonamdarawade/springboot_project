package com.springboot.model;

import java.util.Comparator;

public class Sortbyname implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.bookname.compareTo(b2.bookname);
		
	}

}
