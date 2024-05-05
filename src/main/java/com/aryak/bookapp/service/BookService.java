package com.aryak.bookapp.service;

/**
 * The type Book service.
 */
public class BookService {

    private final BookRepository bookRepository;

    /**
     * Instantiates a new Book service.
     *
     * @param bookRepository the book repository
     */
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    /**
     * Add.
     *
     * @param book the book
     */
    public void add(Book book){
        bookRepository.save(book);
    }

    /**
     * Get no of books int.
     *
     * @return the int
     */
    public int getNoOfBooks(){
        return bookRepository.findAll().size();
    }

}
