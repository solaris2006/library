package com.jlg.library.domain.author;


import com.jlg.library.domain.book.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class Author {

    @Id
    private String id;

    private String name;
    private LocalDate dateOfBirth;

    @DBRef(lazy = true)
    private List<Book> books;

}
