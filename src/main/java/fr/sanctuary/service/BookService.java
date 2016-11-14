package fr.sanctuary.service;

import fr.sanctuary.dto.BookDTO;

public interface BookService {
	BookDTO getBook(final String uuid);
}
