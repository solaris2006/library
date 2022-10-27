package com.jlg.library.application;


import com.jlg.library.application.dto.book.CreateBookDTO;
import com.jlg.library.application.dto.book.EditBookDTO;
import com.jlg.library.domain.book.Book;
import com.jlg.library.domain.book.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BookService {

    BookRepository  bookRepository;


    public void create(CreateBookDTO dto) {
        final Book  book = new Book(
                UUID.randomUUID().toString(),
                dto.getName(),
                dto.getNoOfPages(),
                dto.getAuthors()
        );

        bookRepository.save(book);

    }

    public List<Book> getAll() {
        return this.bookRepository.getAll();
    }

    public void delete(final String bookId) {

        this.bookRepository.delete(bookId);
    }

    public void edit(EditBookDTO dto) {

        final Book existingBook = this.bookRepository.getBookById(dto.getId());

        existingBook.update(dto.getName(), dto.getNoOfPages());

        this.bookRepository.save(existingBook);

    }
}
