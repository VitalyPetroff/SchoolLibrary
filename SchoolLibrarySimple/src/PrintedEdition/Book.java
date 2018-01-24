package PrintedEdition;

import java.util.Date;

public class Book extends PrintedEdition {
    private String author;
    private int numberOfPages;

    Book(String title, Date date, String author, int numberOfPages) {
        super(title, date);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += " Author";
        return result;
    }
}
