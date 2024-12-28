package com.volkova.task8.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "TASK3")
@Accessors(chain = true) // возращается BookEntity, а не void
public class BookEntity {

    @Id
    @Column(nullable = false, unique = true, name = "ID")
    private UUID book_id;

    @Column(nullable = false, name = "BOOK_GENRE")
    private String book_genre;

    @Column(nullable = true, name = "DESCRIPTION")
    private String description;
}