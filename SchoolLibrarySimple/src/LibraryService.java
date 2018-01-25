import PrintedEditions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;

public class LibraryService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryService.class);
    private LibraryDao dao = new LibraryDao("Library.json");

    public void addEdition(Edition edition) {

        dao.saveEdition(edition);
    }

    public void printEditions() {
        ArrayList<Edition> listOfEditions = dao.getAllEditions();
        for (Edition edition : listOfEditions) {
            LOGGER.info(edition.toString());
        }
    }

    public void addPupil(Pupil pupil) {
        dao.savePupil(pupil);
    }

    public void printPupils() {
        ArrayList<Pupil> listOfPupils = dao.getAllPupils();
        for (Pupil pupil : listOfPupils) {
            LOGGER.info(pupil.toString());
        }
    }

    public void readingEdition(String name, String title) {
        Pupil pupil = dao.findByName(name);
        Edition edition = dao.findByTitle(title);
        pupil.readingOfEdition(edition);
        dao.savePupil(pupil);
    }
   /*
    public void sortPupilsByEditions() {
        Collections.sort(pupils, new PupilEditionsComparator());
    }

    public void printPupils() {
        for (Pupil pupil : pupils) {
            LOGGER.info(pupil.getName());
        }
    }*/
}