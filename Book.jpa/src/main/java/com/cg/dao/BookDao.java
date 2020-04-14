package com.cg.dao;

import java.util.List;

import com.cg.bean.Book;

public interface BookDao 
{
public Book getBookById(int id);
public List<Book> getBookByTitle(String title);
public Number getBookCount();
public List<Book> getAuthorBook(String author);
public List<Book> getAllBooks();
public List<Book> getBookInPriceRange(int low,int high);
public void deleteBookById(int id);
public void create(Book b);
}
