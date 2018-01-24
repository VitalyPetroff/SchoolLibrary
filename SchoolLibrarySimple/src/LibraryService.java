import PrintedEditions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class LibraryService {

    private Library library = new Library();

    public void addEditions() {
        for (int i = 0; i < 5; i++) {
            Book book = new Book("BOOK_" + 2 * i,
                    "AUTHOR_" + 2 * i,
                    "PUBLISHING HOUSE_" + 2 * i);
            library.addEdition(book);
            book = new Book("BOOK_" + (2 * i + 1),
                    "AUTHOR_" + (2 * i + 1),
                    "PUBLISHING HOUSE_" + (2 * i + 1));
            library.addEdition(book);
            Journal journal = new Journal("JOURNAL_" + i, (int) (Math.random() * 25 + 25));
            library.addEdition(journal);
            Article article = new Article("ARTICLE_" + i, "AUTHOR_" + i, "TOPIC_" + i);
            library.addEdition(article);
            Newspaper newspaper = new Newspaper("NEWSPAPER_" + i, (int) (Math.random() * 5 + 5));
            library.addEdition(newspaper);
        }
    }

    public void printEditions() {
        ArrayList<Edition> editions = library.getListOfEditions();
        for (Edition edition : editions) {
            System.out.println(edition.toString());
        }
    }

    public void addPupils() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Pupil pupil;
        try {
            pupil = new Pupil("Nick", dateFormat.parse("2005-04-13"));
            library.addPupil(pupil);
            pupil = new Pupil("Bob", dateFormat.parse("2005-07-17"));
            library.addPupil(pupil);
            pupil = new Pupil("John", dateFormat.parse("2004-12-08"));
            library.addPupil(pupil);
            pupil = new Pupil("Jake", dateFormat.parse("2005-02-24"));
            library.addPupil(pupil);
            pupil = new Pupil("Nikole", dateFormat.parse("2006-01-03"));
            library.addPupil(pupil);
            pupil = new Pupil("Sam", dateFormat.parse("2005-09-01"));
            library.addPupil(pupil);
            pupil = new Pupil("Ann", dateFormat.parse("2005-06-22"));
            library.addPupil(pupil);
            pupil = new Pupil("Eva", dateFormat.parse("2004-12-12"));
            library.addPupil(pupil);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void printPupils(){
        ArrayList<Pupil> pupils = library.getPupils();
        for (Pupil pupil : pupils) {
            System.out.println(pupil.toString());
        }
    }
}
