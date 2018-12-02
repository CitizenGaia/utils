package dk.lejengnaver.domain;

import java.util.Date;

@XmlType(namespace = "http://lejengnaver.dk/domain/book")
public class Book {

    private String name;
	
    private String category;
	
    private Date published; 
	
    private Integer pages;
	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

}
