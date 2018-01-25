import PrintedEditions.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryService.class);

    public static void main(String[] args) {
        LibraryService service = new LibraryService();

        addEditions(service);
        addPupils(service);
        reading(service);

        service.firstReport();
        service.secondReport();
        service.thirdReport();
    }

    public static void addEditions(LibraryService service) {
        for (int i = 0; i < 5; i++) {
            service.addEdition(new Book("BOOK_" + 2 * i,
                    "AUTHOR_" + 2 * i,
                    "PUBLISHING HOUSE_" + 2 * i));
            service.addEdition(new Book("BOOK_" + (2 * i + 1),
                    "AUTHOR_" + (2 * i + 1),
                    "PUBLISHING HOUSE_" + (2 * i + 1)));
            service.addEdition(new Journal("JOURNAL_" + i, (int) (Math.random() * 25 + 25)));
            service.addEdition(new Article("ARTICLE_" + i, "AUTHOR_" + i, "TOPIC_" + i));
            service.addEdition(new Newspaper("NEWSPAPER_" + i, (int) (Math.random() * 5 + 5)));
        }
    }

    public static void addPupils(LibraryService service) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        try {
            service.addPupil(new Pupil("Nick", dateFormat.parse("2005")));
            service.addPupil(new Pupil("Bob", dateFormat.parse("2005")));
            service.addPupil(new Pupil("John", dateFormat.parse("2004")));
            service.addPupil(new Pupil("Jake", dateFormat.parse("2005")));
            service.addPupil(new Pupil("Nicole", dateFormat.parse("2003")));
            service.addPupil(new Pupil("Sam", dateFormat.parse("2003")));
            service.addPupil(new Pupil("Ann", dateFormat.parse("2006")));
            service.addPupil(new Pupil("Eva", dateFormat.parse("2004")));
        } catch (ParseException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public static void reading(LibraryService service){
        service.readingOfEdition("Nick", "BOOK_1");
        service.readingOfEdition("Nick", "BOOK_4");
        service.readingOfEdition("Bob", "ARTICLE_2");
        service.readingOfEdition("Bob", "JOURNAL_1");
        service.readingOfEdition("Bob", "NEWSPAPER_3");
        service.readingOfEdition("Bob", "BOOK_1");
        service.readingOfEdition("John", "ARTICLE_1");
        service.readingOfEdition("John", "NEWSPAPER_3");
        service.readingOfEdition("Jake", "JOURNAL_1");
        service.readingOfEdition("Nicole", "BOOK_1");
        service.readingOfEdition("Nicole", "JOURNAL_2");
        service.readingOfEdition("Nicole", "NEWSPAPER_1");
        service.readingOfEdition("Sam", "BOOK_3");
        service.readingOfEdition("Ann", "JOURNAL_1");
        service.readingOfEdition("Ann", "JOURNAL_4");
        service.readingOfEdition("Ann", "BOOK_1");
        service.readingOfEdition("Ann", "ARTICLE_2");
        service.readingOfEdition("Eva", "BOOK_4");
        service.readingOfEdition("Eva", "JOURNAL_2");
    }
}