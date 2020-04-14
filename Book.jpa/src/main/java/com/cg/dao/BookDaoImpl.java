package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.bean.Book;

@Repository
@Transactional
public class BookDaoImpl implements BookDao 
{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Book getBookById(int id) 
	{
	    return em.find(Book.class, id);
	}

	@Override
	public List<Book> getBookByTitle(String title)
	{
		Query q=em.createQuery("select b from Book b where b.title=:title");
		q.setParameter("title",title);
		return q.getResultList();
	}

	@Override
	public Number getBookCount() 
	{
		Query q=em.createQuery("select COUNT(b.id) from Book b");
		return (Number)q.getSingleResult();
	}

	@Override
	public List<Book> getAuthorBook(String author) 
	{
		Query q=em.createQuery("select b from Book b where b.author=:author");
		q.setParameter("author", author);
		return q.getResultList();
	}

	@Override
	public List<Book> getAllBooks()
	{
		Query q=em.createQuery("select b from Book b");
		return q.getResultList();
	}

	@Override
	public List<Book> getBookInPriceRange(int low, int high)
	{
		Query q=em.createQuery("select b from Book b where b.price BETWEEN :low AND :high");
		q.setParameter("low", low);
		q.setParameter("high",high);
		return q.getResultList();
	}

	@Override
	public void deleteBookById(int id) 
	{
		em.remove(em.find(Book.class, id));
		System.out.println("Removed");
	}

	@Override
	public void create(Book b) 
	{
		em.persist(b);
		
	}

	

}
