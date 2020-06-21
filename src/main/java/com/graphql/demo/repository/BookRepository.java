package com.graphql.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.demo.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
