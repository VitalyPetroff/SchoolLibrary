package PrintedEditions;

public class Journal extends Edition {
    private int numberOfPages;


    Journal(String title, int numberOfPages) {
        super(title);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += " Number of pages:" + numberOfPages;
        return result;
    }
}
