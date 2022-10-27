package com.jlg.library.infrastructure;

import com.jlg.library.domain.book.Book;
import com.jlg.library.domain.book.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@AllArgsConstructor
public class BookRepositoryImpl implements BookRepository {

    private MongoTemplate mongoTemplate;

    @Override
    public void save(final Book book) {
        mongoTemplate.save(book);
    }

    @Override
    public List<Book> getAll() {
        return mongoTemplate.findAll(Book.class);
    }

    @Override
    public Book getBookById(String bookId) {
        return mongoTemplate.findById(bookId, Book.class);
    }

    @Override
    public void delete(String bookId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(bookId));

        mongoTemplate.remove(query, Book.class);
    }
}
