package com.yaswanth.domain;
import org.springframework.hateoas.RepresentationModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends RepresentationModel<Book> {
	private String ISBN;
	private String BookName;
	private String Author;
	private int Price;

}
