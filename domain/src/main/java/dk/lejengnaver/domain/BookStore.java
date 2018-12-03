package dk.lejengnaver.domain;

import java.util.List;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://lejengnaver.dk/domain/bookstore")
public class BookStore {

    private String name;
    
    private List<Book> books;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
		
    public void addBook(Book book) {
        this.books.add(book);
    }
		
    public List<Book> getBooks() {
        return this.books;
    }

}
