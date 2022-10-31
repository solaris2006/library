package com.jlg.library.application.dto.author;


import com.jlg.library.domain.book.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class CreateAuthorDTO {

    private String name;
    private LocalDate dateOfBirth;
    private List<Book> books;
}
