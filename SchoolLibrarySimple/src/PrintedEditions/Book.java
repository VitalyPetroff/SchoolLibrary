package PrintedEditions;

public class Book extends Edition {
    private String author;
    private String publishingHouse;

    public Book(String title, String author, String publishingHouse) {
        super(title);
        this.author = author;
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        String bookInfo = super.toString();
        bookInfo += " Author:" + author + " Publishing House:" + publishingHouse;
        return bookInfo;
    }
}
