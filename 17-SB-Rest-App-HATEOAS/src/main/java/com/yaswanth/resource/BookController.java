package com.yaswanth.resource;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.LinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import com.yaswanth.domain.Book;

@RestController
public class BookController {
	
	@GetMapping(value = "/books/{isbn}")
	public Book GetBook(@PathVariable("isbn") String ISBN) {
		Book book = new Book(ISBN,"Spring Fundamentals","Richchard",250);
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookController.class).GetBooks()).withRel("all-books");;
		book.add(link);
		return book;
	}
	@GetMapping(value = "/books")
	public List<Book> GetBooks() {
		Book book1 = new Book("101","Spring Fundamentals","Richchard",250);
		Book book2 = new Book("102","Spring Fundamentals","Richchard",250);
		Book book3 = new Book("103","Spring Fundamentals","Richchard",250);
		List<Book> Books = new ArrayList<Book>();
		Books.add(book1);
		Books.add(book2);
		Books.add(book3);
		return Books;
	}

}
