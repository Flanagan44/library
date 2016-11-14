package fr.sanctuary.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.sanctuary.dto.BookDTO;
import fr.sanctuary.service.BookService;

@CrossOrigin
@RestController
@RequestMapping(value = "/books")
public class BookWS {
	private final BookService bookService;
	
	@Autowired
	public BookWS(final BookService bookService)
	{
		this.bookService = bookService;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{uuid}")
	public BookDTO getBook() {
		return bookService.getBook("");
	}
}
