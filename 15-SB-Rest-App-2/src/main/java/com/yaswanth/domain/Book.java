package com.yaswanth.domain;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	private int BookId;
	private String BookName;
	private String BookAuthor;
}
