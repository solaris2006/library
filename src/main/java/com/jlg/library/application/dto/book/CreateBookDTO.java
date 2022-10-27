package com.jlg.library.application.dto.book;


import com.jlg.library.domain.author.Author;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Getter
public class CreateBookDTO {

    private String name;
    private int noOfPages;
    private List<Author> authors;
}
