package com.cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.entity.Book;

import com.cruds.service.BookService;


@Controller
public class BookController 
{
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="book.html", method=RequestMethod.GET)
	public String showPage(Model model)
	{
		model.addAttribute("command", new Book());
		model.addAttribute("BOOK_LIST", bookService.getAll());
		return "book";
	}
	
	@RequestMapping(value="book.html", method=RequestMethod.POST)
	public String doBook(@ModelAttribute("book") Book b) 			
	{
		bookService.create(b);
		return "redirect: book.html";
	}

}
