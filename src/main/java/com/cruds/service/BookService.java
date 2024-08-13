package com.cruds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.dao.BookDAO;
import com.cruds.dao.DepartmentDAO;
import com.cruds.entity.Book;
import com.cruds.entity.Department;

@Service
public class BookService 
{
	@Autowired
	private BookDAO bookDAO;
	
	public void create(Book b)
	{
		bookDAO.create(b);
	}
	
	public List<Book> getAll()
	{
		return bookDAO.getAll();
	}
}
