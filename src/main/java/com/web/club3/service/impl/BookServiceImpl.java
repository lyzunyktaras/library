package com.web.club3.service.impl;

import com.web.club3.dao.impl.BookDAOImpl;
import com.web.club3.model.Author;
import com.web.club3.model.Book;
import com.web.club3.service.BookService;
import com.web.club3.service.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements CRUDService<Book>, BookService {
    private BookDAOImpl bookDAO;

    @Autowired
    public BookServiceImpl(BookDAOImpl bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    public Book findById(int id) {
        return bookDAO.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public Book create(Book book) {
        return bookDAO.create(book);
    }

    @Override
    public Book update(Book book) {
        return bookDAO.update(book);
    }

    @Override
    public void deleteById(int id) {
        bookDAO.deleteById(id);
    }

    @Override
    public boolean available(int id)
    {
        return  bookDAO.available(id);
    }

    @Override
    public List<Book> findByAuthor(Author author)
    {
        return bookDAO.findByAuthor(author);
    }

    @Override
    public Book findByTitle(String title)
    {
        return bookDAO.findByTitle(title);
    }

    @Override
    public void updateCopiesById(int id,int copies){bookDAO.updateCopiesById(id, copies);}

    @Override
    public int getCopiesById(int id)
    {
        return bookDAO.getCopiesById(id);
    }
}