package org.softserve.javaclub.team3.library.service;

import org.softserve.javaclub.team3.library.dto.AuthorDto;
import org.softserve.javaclub.team3.library.dto.BookDto;
import org.softserve.javaclub.team3.library.model.Book;

import java.util.List;

public interface BookService {

    Book findById(String bookId);
    List<Book> findAll();
    Book findByTitle(String title);
    List<Book> findAllBooksByAuthor(String surname);

    void addBook(BookDto bookDto);
    void updateBook(Book book);
    void removeBook(Book book);
    void removeBookById(String bookId);

}