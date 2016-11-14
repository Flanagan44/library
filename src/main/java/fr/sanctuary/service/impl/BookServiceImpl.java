package fr.sanctuary.service.impl;

import org.springframework.stereotype.Service;

import fr.sanctuary.dto.BookDTO;
import fr.sanctuary.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Override
	public BookDTO getBook(String uuid) {
		return new BookDTO();
	}

}
