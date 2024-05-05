package com.aryak.bookapp.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {

    final private Map<Integer,Book> bookStore = new HashMap<>();

    @Override
    public void save(Book book) {
        bookStore.put(book.bookId(), book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}
