package com.springboot.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.model.Book;
import com.springboot.model.Sortbyname;

@Repository
@Transactional
public class BookDaoImpl implements BookDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public String addBook(Book book) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.save(book);
		//.out.println("BookName:"+((Book) book).getBookname());
		return "Added Book Successfully";

	}

	
	//@Override
	/*public String addBook(book) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		//ArrayList<Book> book = new ArrayList<Book>();
	   // Collections.sort(book1, new Sortbyname());
	   // for(User user : newUsers)

	    
		session.save(book);
		//.out.println("BookName:"+((Book) book).getBookname());
		return "Added Book Successfully";
	}*/

	@Override
	public String deleteBook(Book book) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(book);
		return "Delete Book Details";
	}

	@Override
	public String updateBook(Book book) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.update(book);
		return "Updated Student Details Successfully";
		
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		List<Book> list = session.createCriteria(Book.class).list();
		return list;
	}

	@Override
	public Book getBookByBookId(int bookid) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Book where empId = "+bookid+"");
		Book book = (Book) q.list().get(0);
		//List<empModel> emp = (empModel) q.list().get(0);
		return book;
	}

	
}
