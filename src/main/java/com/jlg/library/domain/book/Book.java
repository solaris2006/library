package com.jlg.library.domain.book;


import com.jlg.library.domain.author.Author;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Document
public class Book {

    @Id
    private String id;
    private String name;
    private int noOfPages;
    @DBRef(lazy = true)
    private List<Author> authors;

    public void update(final String name, final int noOfPages){
        this.name = name;
        this.noOfPages = noOfPages;
    }


}
