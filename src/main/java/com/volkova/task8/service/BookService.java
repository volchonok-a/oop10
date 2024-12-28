package com.volkova.task8.service;

import com.volkova.task8.entity.BookEntity;
import com.volkova.task8.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;



    @Transactional
    public BookEntity updateBook(UUID book_id, String book_genre, String description){
        Optional<BookEntity> bookOpt = bookRepository.findById(book_id);

        BookEntity book = bookOpt.orElse(null);

        book.setBook_genre(book_genre);
        book.setDescription(description);

        return bookRepository.save(book);
    }


    @Transactional
    public BookEntity addNewBook(String book_genre, String description){
        BookEntity book = new BookEntity();
        book.setBook_id(UUID.randomUUID());
        book.setBook_genre(book_genre);
        book.setDescription(description);

        return bookRepository.save(book);
    }

    @Transactional
    public void delBookById(UUID book_id){

        bookRepository.deleteById(book_id);
    }

}
