package com.graphql.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id", nullable=false)
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(name = "book_name")
    private String bookName;
	
	@Column(name = "publish_date")
    private LocalDate publishDate;
	
	@Column(name="author")
	private String author;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
