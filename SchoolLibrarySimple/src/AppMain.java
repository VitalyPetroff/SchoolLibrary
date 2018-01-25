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
        service.printEditions();

        addPupils(service);
        service.printPupils();
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
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            service.addPupil(new Pupil("Nick", dateFormat.parse("2005-04-13")));
            service.addPupil(new Pupil("Bob", dateFormat.parse("2005-07-17")));
            service.addPupil(new Pupil("John", dateFormat.parse("2004-12-08")));
            service.addPupil(new Pupil("Jake", dateFormat.parse("2005-02-24")));
            service.addPupil(new Pupil("Nicole", dateFormat.parse("2006-01-03")));
            service.addPupil(new Pupil("Sam", dateFormat.parse("2005-09-01")));
            service.addPupil(new Pupil("Ann", dateFormat.parse("2005-06-22")));
            service.addPupil(new Pupil("Eva", dateFormat.parse("2004-12-12")));
        } catch (ParseException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public static void reading(LibraryService service){

    }
}