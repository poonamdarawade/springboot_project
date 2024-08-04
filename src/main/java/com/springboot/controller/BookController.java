package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Book;
import com.springboot.service.BookService;


@RestController
public class BookController {
	
	@Autowired
	BookService bookservice; 
	
	@RequestMapping(value="/StartAppService")
	public String Start()
	{
		return "Start SpringBoot Successfully";
		
	}
	
/**************Add Book Data ***********************/
	
	@RequestMapping(value="/addBookData",method=RequestMethod.POST)
	public String addEmp(@RequestBody Book  book)
	{
		bookservice.addBook(book);
		return "Added Book details successfully" ;
		
	}
	
/*****************************Delete Student Data*************************/
	
	@RequestMapping(value="/deletebookData",method=RequestMethod.DELETE)
	public String deleteEmp(@RequestBody Book book)
	{
		bookservice.deleteBook(book);
		return "Deleted book details successfully";
		
	}
	
/*****************************get All Book Data*************************/
	
	@RequestMapping(value="/GetAllBookData",method=RequestMethod.GET)
	public List<Book> getAllBook()
	{
		return  bookservice.getAllBook();
	}
	
	/*************************Get Book  by empId************************************************/

	@RequestMapping(value="/GetBookById/{bookid}",method=RequestMethod.GET)
	public Book getStudDataById(@PathVariable("bookid") int bookid)
	{
	 Book book = bookservice.getBookByBookId(bookid);
	   return book;
	 }

}
