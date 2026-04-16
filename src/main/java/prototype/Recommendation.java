package prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    List<Book> books;


    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    // Deep copy
    @Override
    public Recommendation clone() {
        try {
            Recommendation cloned = (Recommendation) super.clone();
            cloned.books = new ArrayList<>();
            for (Book book : this.books) {
                cloned.books.add(book.clone());
            }
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void addBook(Book book) { 
        books.add(book); 
    }
    public void removeBook(Book book) { 
        books.remove(book); 
    }

    public void setTargetAudience(String targetAudience) { 
        this.targetAudience = targetAudience;
    }
    public String getTargetAudience() { 
        return targetAudience; 
    }

    public List<Book> getBooks() { 
        return books; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Target Audience: " + targetAudience + "\nBooks:\n");
        for (Book book : books) {
            sb.append(" - ").append(book.toString()).append("\n");
        }
        return sb.toString();
    }
    
}
