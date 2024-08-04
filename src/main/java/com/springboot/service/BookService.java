package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import com.springboot.model.Book;

public interface BookService {
	
	public String addBook(Book book );
	//public String addBook(ArrayList<Book> book);
	public String deleteBook(Book book);
	public String updateBook(Book std);
	public List<Book> getAllBook();
	public Book getBookByBookId(int std);



}
