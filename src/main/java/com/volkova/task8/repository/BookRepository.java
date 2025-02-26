package com.volkova.task8.repository;


import com.volkova.task8.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, UUID> {
}
