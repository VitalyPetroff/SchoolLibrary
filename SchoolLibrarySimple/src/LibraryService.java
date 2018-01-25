import PrintedEditions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;

public class LibraryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryService.class);
    private Library library = new Library();

    public void addEdition(Edition edition) {
        library.listOfEditions.add(edition);
    }

    public void printEditions() {
        for (Edition edition : library.listOfEditions) {
            LOGGER.info(edition.toString());
        }
    }

    public void addPupil(Pupil pupil) {
        library.listOfPupils.add(pupil);
    }

    public void printPupils() {
        for (Pupil pupil : library.listOfPupils) {
            LOGGER.info(pupil.toString());
        }
    }

    public void readingOfEdition(String name, String title) {
        Pupil pupil = findByName(name);
        Edition edition = findByTitle(title);
        pupil.readingOfEdition(edition);
    }

    public Edition findByTitle(String title) {
        Edition result = null;
        for (Edition ed : library.listOfEditions) {
            if (ed.getTitle().equals(title)) {
                result = ed;
            }
        }
        return result;
    }

    public Pupil findByName(String name) {
        Pupil result = null;
        for (Pupil pupil : library.listOfPupils) {
            if (pupil.getName().equals(name)) {
                result = pupil;
            }
        }
        return result;
    }

    public void sorting()
}