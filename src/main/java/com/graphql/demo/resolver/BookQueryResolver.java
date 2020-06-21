package com.graphql.demo.resolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.demo.entity.Book;
import com.graphql.demo.repository.BookRepository;

@Component
public class BookQueryResolver implements GraphQLQueryResolver{
	@Autowired
	BookRepository bookRepository;
	
	public Optional<Book> getBook(int id){
		return bookRepository.findById(id);
	}

}
