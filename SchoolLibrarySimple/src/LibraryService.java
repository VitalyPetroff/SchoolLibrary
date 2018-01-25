import PrintedEditions.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;

public class LibraryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LibraryService.class);
    private Library library = new Library();

    public void addEdition(Edition edition) {
        library.listOfEditions.add(edition);
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

    public void firstReport() {
        LOGGER.info("===FIRST REPORT. THE LIST OF AVAILABLE FOR READING===:");
        for (Edition edition : library.listOfEditions) {
            LOGGER.info(edition.toString());
        }
    }

    public void secondReport(){
        PupilEditionsComparator comparator = new PupilEditionsComparator();
        library.listOfPupils.sort(comparator);
        Collections.reverse(library.listOfPupils);
        LOGGER.info("===SECOND REPORT. PUPILS WHO HAVE READ MORE THAN 1 BOOK===");
        for (Pupil pupil : library.listOfPupils) {
            if (pupil.getListOfEditions().size() > 1) {
                LOGGER.info(pupil.getName() + ":" + pupil.getListOfEditions().size());
            }
        }
    }

    public void thirdReport(){
        Comparator<Pupil> comparator = new PupilAgeComparator().thenComparing(new PupilEditionsComparatorInverse());
        library.listOfPupils.sort(comparator);
        Collections.reverse(library.listOfPupils);
        printPupils();
        LOGGER.info("===THIRD REPORT. PUPILS WHO HAVE READ LESS THAN OR EQUAL TO 2 BOOKS===");
        String result;
        for (Pupil pupil : library.listOfPupils) {
            if (pupil.getListOfEditions().size() <= 2) {
                result = new SimpleDateFormat("yyyy").format(pupil.getDateOfBirth()) + ":" +
                        pupil.getListOfEditions().size();
                if (pupil.getListOfEditions().size() == 2) {
                    result = pupil.getName() + ", " + result;
                }
                LOGGER.info(result);
            }
        }
    }
}