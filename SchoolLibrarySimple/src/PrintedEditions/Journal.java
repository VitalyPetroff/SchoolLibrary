package PrintedEditions;

public class Journal extends Edition {
    private int numberOfPages;

    public Journal(String title, int numberOfPages) {
        super(title);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        String journalInfo = super.toString();
        journalInfo += " Number of pages:" + numberOfPages;
        return journalInfo;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
