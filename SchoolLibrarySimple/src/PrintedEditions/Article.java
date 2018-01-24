package PrintedEditions;

public class Article extends Edition {
    private String author;
    private String topic;

    public Article(String title, String author, String topic) {
        super(title);
        this.author = author;
        this.topic = topic;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += " Author:" + author + " Topic:" + topic;
        return result;
    }
}
