package com.cruds.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Book;


@Repository
public class BookDAOImpl implements BookDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void create(Book book)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}

	public List<Book> getAll() 
	{
		Session session = sessionFactory.openSession();
		List<Book> list = session.createQuery("from Book").list();
		session.close();
		return list;
	}
}
