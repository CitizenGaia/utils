package dk.lejengnaver.domain;

import java.util.Date;

@XmlType(namespace = "http://lejengnaver.dk.domain/book")
public class Book {

    private String name;
	
	private String category;
	
	private Date published; 
	
	private Integer pages;

}
