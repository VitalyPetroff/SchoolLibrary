package PrintedEditions;

public abstract class Edition{
    private String title;

    Edition(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        String result;
        result = "Title:" + title;
        return result;
    }
}