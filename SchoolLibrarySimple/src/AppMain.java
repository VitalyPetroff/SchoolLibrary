import PrintedEditions.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AppMain {

    private static LibraryService service = new LibraryService();

    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryService.class);

    public static void main(String[] args) {
        service.addAllEditions(addEditions());
        service.addAllPupils(addPupils());
        String[] names = {"Nick", "Nick", "Bob", "Bob", "Bob", "Bob", "John", "John", "Jake",
                "Nicole", "Nicole", "Nicole", "Sam", "Ann","Ann", "Ann", "Ann", "Eva", "Eva"};
        String[] editions = {"BOOK_1", "BOOK_4", "ARTICLE_2", "JOURNAL_1", "NEWSPAPER_3", "BOOK_1",
                "ARTICLE_1", "NEWSPAPER_3", "JOURNAL_1", "BOOK_1", "JOURNAL_2", "NEWSPAPER_1", "BOOK_3",
                "JOURNAL_1", "JOURNAL_4", "BOOK_1", "ARTICLE_2", "BOOK_4", "JOURNAL_2"};
        service.readingAll(names, editions);

        service.firstReport();
        service.secondReport();
        service.thirdReport();
    }

    public static ArrayList<Edition> addEditions() {
        ArrayList<Edition> editions = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            editions.add(new Book("BOOK_" + 2 * i,
                    "AUTHOR_" + 2 * i,
                    "PUBLISHING HOUSE_" + 2 * i));
            editions.add(new Book("BOOK_" + (2 * i + 1),
                    "AUTHOR_" + (2 * i + 1),
                    "PUBLISHING HOUSE_" + (2 * i + 1)));
            editions.add(new Journal("JOURNAL_" + i, (int) (Math.random() * 25 + 25)));
            editions.add(new Article("ARTICLE_" + i, "AUTHOR_" + i, "TOPIC_" + i));
            editions.add(new Newspaper("NEWSPAPER_" + i, (int) (Math.random() * 5 + 5)));
        }
        return editions;
    }

    public static ArrayList<Pupil> addPupils() {
        ArrayList<Pupil> pupils = new ArrayList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        try {
            pupils.add(new Pupil("Nick", dateFormat.parse("2005")));
            pupils.add(new Pupil("Bob", dateFormat.parse("2005")));
            pupils.add(new Pupil("John", dateFormat.parse("2004")));
            pupils.add(new Pupil("Jake", dateFormat.parse("2005")));
            pupils.add(new Pupil("Nicole", dateFormat.parse("2003")));
            pupils.add(new Pupil("Sam", dateFormat.parse("2003")));
            pupils.add(new Pupil("Ann", dateFormat.parse("2006")));
            pupils.add(new Pupil("Eva", dateFormat.parse("2004")));
        } catch (ParseException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return pupils;
    }
}