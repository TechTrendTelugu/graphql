package com.graphql.demo.resolver;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.demo.entity.Book;
import com.graphql.demo.repository.BookRepository;

@Component
public class BookMutationResolver implements GraphQLMutationResolver{

	@Autowired
	BookRepository bookRepository;
	
	@Transactional
	public Book createBook(final String bookName,final String publishDate, final String author) {
		Book book =new Book();
		book.setBookName(bookName);
		book.setPublishDate(LocalDate.parse(publishDate));
		book.setAuthor(author);
		return bookRepository.save(book);
	}
}
