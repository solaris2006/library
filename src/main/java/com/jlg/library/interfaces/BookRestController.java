package com.jlg.library.interfaces;


import com.jlg.library.application.BookService;
import com.jlg.library.application.dto.book.CreateBookDTO;
import com.jlg.library.application.dto.book.EditBookDTO;
import com.jlg.library.domain.book.Book;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookRestController {


    private BookService bookService;

    @PostMapping
    public ResponseEntity<Void> create(final @RequestBody CreateBookDTO dto){

        this.bookService.create(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAll(){

        return ResponseEntity.ok(this.bookService.getAll());
    }

    @GetMapping("/bookId")
    ResponseEntity<Book> getById(final @RequestParam String bookId){
        return ResponseEntity.ok(this.bookService.getById(bookId));
    }

    @DeleteMapping("/bookId")
    public ResponseEntity<Void> delete(final @PathVariable String bookId){
        this.bookService.delete(bookId);
        return ResponseEntity.ok().build();
    }


    @PatchMapping ResponseEntity<Void> update(final @RequestBody EditBookDTO dto){
        this.bookService.edit(dto);

        return ResponseEntity.ok().build();
    }

}
