package com.lms.demo.service;
import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



package com.lms.demo.data.model.Book;
package com.lms.demo.data.repository.BookRepository;

@Service
public class bookservice {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book entity) {
        return bookRepository.save(entity);
    }

    @Override
    public Book getById(Serializable UUID,Serializable title,Serializable author,Serializable category) {
        return bookRepository.findOne((String) UUID ,(String) title ,(String) author,(String) category  );
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public void returnBooking(Serializable id) {
        bookRepository.save((Long) id);