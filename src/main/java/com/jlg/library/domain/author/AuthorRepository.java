package com.jlg.library.domain.author;

import java.util.List;

public interface AuthorRepository {

    void save(final  Author author);

    List<Author> getAll();

    Author getPassengerById(String authorId);

    void delete(String authorId);
}
