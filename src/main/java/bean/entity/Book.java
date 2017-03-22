package bean.entity;

import java.util.Date;

/**
 * Created by dmirry on 05.03.17.
 */
public class Book {
    int idBook;
    String description;
    int countOfPages;
    String language;
    int idAuthor;
    String publisher;
    Date YearOfPublishing; //был Date, TODO

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (idBook != book.idBook) return false;
        if (countOfPages != book.countOfPages) return false;
        if (idAuthor != book.idAuthor) return false;
        if (description != null ? !description.equals(book.description) : book.description != null) return false;
        if (language != null ? !language.equals(book.language) : book.language != null) return false;
        if (publisher != null ? !publisher.equals(book.publisher) : book.publisher != null) return false;
        return YearOfPublishing != null ? YearOfPublishing.equals(book.YearOfPublishing) : book.YearOfPublishing == null;
    }

    @Override
    public int hashCode() {
        int result = idBook;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + countOfPages;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + idAuthor;
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + (YearOfPublishing != null ? YearOfPublishing.hashCode() : 0);
        return result;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getYearOfPublishing() {
        return YearOfPublishing;
    }

    public void setYearOfPublishing(Date yearOfPublishing) {
        YearOfPublishing = yearOfPublishing;
    }


}
