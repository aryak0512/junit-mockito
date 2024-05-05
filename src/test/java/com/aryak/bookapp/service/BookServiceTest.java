package com.aryak.bookapp.service;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void fake_test_add_a_book() {

        // given - inject fake repository as dependency
        BookRepository bookRepository = new FakeBookRepository();
        BookService bookService = new BookService(bookRepository);

        // when
        bookService.add(new Book(234, "Junit 5", 475.00, LocalDate.now()));
        bookService.add(new Book(235, "Spring 6", 775.00, LocalDate.now()));

        // then
        assertEquals(2,bookService.getNoOfBooks());
    }

}