package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.BookDao;
import com.springboot.model.Book;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookdao;
	
	@Override
	public String addBook(Book book) {
		// TODO Auto-generated method stub
		bookdao.addBook(book);
		return "Add Book Successfully";
	}

	@Override
	public String deleteBook(Book book) {
		// TODO Auto-generated method stub
		bookdao.deleteBook(book);
		return "Delete Book Sucessfully";
	}

	@Override
	public String updateBook(Book std) {
		// TODO Auto-generated method stub
		bookdao.updateBook(std);
		return "Update Book Successfully";
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		List<Book> list = bookdao.getAllBook();
		return list;
		
	}

	@Override
	public Book getBookByBookId(int bookid) {
		// TODO Auto-generated method stub
		Book book = bookdao.getBookByBookId(bookid);
		return book;
	}

}
