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
        String articleInfo = super.toString();
        articleInfo += " Author: " + author + " Topic: " + topic;
        return articleInfo;
    }

    public String getAuthor() {
        return author;
    }

    public String getTopic() {
        return topic;
    }
}