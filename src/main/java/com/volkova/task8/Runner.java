package com.volkova.task8;

import com.volkova.task8.entity.BookEntity;
import com.volkova.task8.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {

    private final BookService bookService;


    @Override
    public void run(String[] args) {
        BookEntity newBook = bookService.addNewBook("Драма", "Книга о любви");
        System.out.println("Добавлена новая книга с ID: " + newBook.getBook_id());



        /*bookService.updateBook(UUID.fromString("8eaaa877-5af8-428e-9f2c-423cb3498792"), "Комедия", "Хихихаха");
        System.out.println("Обновили книгу");

        bookService.delBookById(UUID.fromString("350f8402-ce8c-486f-a06b-74e029c19036"));
        System.out.println("Удалили книгу");*/
    }
}