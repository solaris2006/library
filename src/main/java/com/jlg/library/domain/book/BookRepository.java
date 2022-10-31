package com.jlg.library.domain.book;

import java.util.List;

public interface BookRepository {

    void save(final  Book book);

    List<Book> getAll();

    Book getBookById(String bookId);

    void delete(String bookId);

    Book findById(String bookId);
}
