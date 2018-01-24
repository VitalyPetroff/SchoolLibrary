package PrintedEditions;

public class Newspaper extends Edition {
    private int price;

    Newspaper(String title, int price) {
        super(title);
        this.price = price;
    }
}