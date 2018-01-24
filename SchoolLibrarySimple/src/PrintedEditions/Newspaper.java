package PrintedEditions;

public class Newspaper extends Edition {
    private int price;

    public Newspaper(String title, int price) {
        super(title);
        this.price = price;
    }

    @Override
    public String toString() {
        String newspaperInfo = super.toString();
        newspaperInfo += " Price:" + price;
        return newspaperInfo;
    }
}