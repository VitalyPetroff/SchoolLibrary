import PrintedEditions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;

public class LibraryService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryService.class);
    private Library library = new Library();

    public void addEditions() {
        for (int i = 0; i < 5; i++) {
            library.addEdition(new Book("BOOK_" + 2 * i,
                    "AUTHOR_" + 2 * i,
                    "PUBLISHING HOUSE_" + 2 * i));
            library.addEdition(new Book("BOOK_" + (2 * i + 1),
                    "AUTHOR_" + (2 * i + 1),
                    "PUBLISHING HOUSE_" + (2 * i + 1)));
            library.addEdition(new Journal("JOURNAL_" + i, (int) (Math.random() * 25 + 25)));
            library.addEdition(new Article("ARTICLE_" + i, "AUTHOR_" + i, "TOPIC_" + i));
            library.addEdition(new Newspaper("NEWSPAPER_" + i, (int) (Math.random() * 5 + 5)));
        }
    }

    public void printEditions() {
        for (Edition edition : library.editions) {
            LOGGER.info(edition.toString());
        }
    }

    public void addPupils() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            library.addPupil(new Pupil("Nick", dateFormat.parse("2005-04-13")));
            library.addPupil(new Pupil("Bob", dateFormat.parse("2005-07-17")));
            library.addPupil(new Pupil("John", dateFormat.parse("2004-12-08")));
            library.addPupil(new Pupil("Jake", dateFormat.parse("2005-02-24")));
            library.addPupil(new Pupil("Nicole", dateFormat.parse("2006-01-03")));
            library.addPupil(new Pupil("Sam", dateFormat.parse("2005-09-01")));
            library.addPupil(new Pupil("Ann", dateFormat.parse("2005-06-22")));
            library.addPupil(new Pupil("Eva", dateFormat.parse("2004-12-12")));
        } catch (ParseException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    public void sortPupilsByEditions(){
        Collections.sort(library.pupils, new PupilEditionsComparator());
    }

    public void printPupils(){
        for (Pupil pupil : library.pupils) {
            LOGGER.info(pupil.getName());
        }
    }
}