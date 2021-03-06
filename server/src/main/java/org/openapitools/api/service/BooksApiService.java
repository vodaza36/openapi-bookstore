package org.openapitools.api.service;

import org.openapitools.api.BooksApiDelegate;
import org.openapitools.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksApiService implements BooksApiDelegate {

    @Override
    public ResponseEntity<List<Book>> findAllBooks() {
        List<Book> bookList = new ArrayList<>();
        Book book1 = new Book();
        book1.setId(100);
        book1.setName("MyTestBook");
        bookList.add(book1);
        ResponseEntity<List<Book>> books = new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
        return books;
    }
}
