package dk.lejengnaver;

import java.util.List;

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
