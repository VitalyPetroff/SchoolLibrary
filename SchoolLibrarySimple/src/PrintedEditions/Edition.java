package PrintedEditions;

public abstract class Edition{
    private String title;

    Edition(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Title:" + title;
    }

    public String getTitle() {
        return title;
    }
}