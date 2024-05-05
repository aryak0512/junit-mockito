package com.aryak.bookapp.service;

import java.util.Collection;

public interface BookRepository {

    void save(Book book);

    Collection<Book> findAll();
}
