import PrintedEdition.Article;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    public static void main(String[] args) {
        Library library = new Library();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = dateFormat.parse("2018-01-24");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Article article = new Article("Title", date, "Autor", "Topic");

        System.out.println(article.toString());
    }
}
