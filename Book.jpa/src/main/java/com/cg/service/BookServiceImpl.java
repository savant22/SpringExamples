package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.bean.Book;
import com.cg.dao.BookDao;
import com.cg.dao.BookDaoImpl;

@Repository
public class BookServiceImpl implements BookService 
{
	@Autowired
	private BookDao dao;

	@Override
	public Book getBookById(int id) 
	{
		
		return dao.getBookById(id);
	}

	@Override
	public List<Book> getBookByTitle(String title) 
	{
	
		return dao.getBookByTitle(title);
	}

	@Override
	public Number getBookCount() 
	{
		
		return  dao.getBookCount();
	}

	@Override
	public List<Book> getAuthorBook(String author) 
	{
		
		return dao.getAuthorBook(author);
	}

	@Override
	public List<Book> getAllBooks() 
	{
		
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getBookInPriceRange(int low, int high) 
	{
		
		return dao.getBookInPriceRange(low, high);
	}

	@Override
	public void deleteBookById(int id) 
	{
	    dao.deleteBookById(id);
		
	}

	@Override
	public void create(Book b) 
	{
		dao.create(b);
		
	}

}
