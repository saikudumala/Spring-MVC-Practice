package com.yaswanth.restresource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yaswanth.domain.Book;

@RestController
public class BookResource {

	@GetMapping("/book")
	public String getBookById(@RequestParam("BookId") int BookId) {
		if(BookId==101) {
			Book b = new Book(101,"Spring","Rod Jhonson");
			return b.toString();
		}
		else if(BookId==102) {
			Book b = new Book(102,"Hibernate","Gavin King");
			return b.toString();
		}
		return null;
	}
	@GetMapping(value="/bookPrice", produces= {"application/json","application/xml"})
	public Book getBookbyNandA(@RequestParam("Bname") String Bname, @RequestParam("Bauthor") String Aname) {
		if(Bname.equals("Spring") && Aname.equals("RodJhonson")) {
			Book b = new Book(101,"Spring","Rod Jhonson");
			return b;
		}
		else if(Bname.equals("Hibernate") && Aname.equals("Gavin King")) {
			Book b = new Book(102,"Hibernate","Gavin King");
			return b;
		}
		else if(Bname.equals("Web Services") && Aname.equals("Ricchard")) {
			Book b = new Book(101,"Web Services","Ricchard");
			return b;
		}
		return null;
	}
}
