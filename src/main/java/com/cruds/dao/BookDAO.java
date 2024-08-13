package com.cruds.dao;

import java.util.List;

import com.cruds.entity.Book;

public interface BookDAO 
{
	public void create(Book book);
	public List<Book> getAll();
}
