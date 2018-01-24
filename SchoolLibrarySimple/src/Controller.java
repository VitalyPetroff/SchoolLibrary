import PrintedEdition.Article;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    public static void main(String[] args) {
        Library library = new Library();
        Date date = null;
        try {
            date = (new SimpleDateFormat("yyyy-MM-dd")).parse("2011-11-11");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Article article = new Article("Title", date, "Autor", "Topic");

        System.out.println(article.toString());
    }
}
