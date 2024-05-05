package com.aryak.bookapp.service;

import java.time.LocalDate;

public record Book(int bookId, String title, double price, LocalDate publishDate) {
}
