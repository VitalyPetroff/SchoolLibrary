import PrintedEditions.Article;
import PrintedEditions.Book;
import PrintedEditions.Journal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {

    public static void main(String[] args) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try {
//            date = dateFormat.parse("2018-01-24");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        Library library = new Library();
        for (int i = 0; i < 5; i++) {
            library.addEdition(new Article("Article" + i, "Author" + i, "Topic" + i));
            library.addEdition(new Book("Book" + i, "Author" + i, "PublishingHouse" + i));
            library.addEdition(new Book("Book" + 2 * i + 1,
                    "Author" + 2 * i + 1,
                    "PublishingHouse" + 2 * i + 1));
            library.addEdition(new Journal("Journal" + i, (int)(Math.random() * 25 + 25)));

        }
    }
